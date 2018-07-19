package shopadmin.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import shopadmin.mapper.OperatorMapper;

@Configuration
@EnableWebSecurity // 获得了springSecurityFilterChain组件
@EnableGlobalMethodSecurity(prePostEnabled = true) // 开启方法级别权限检查支持（@PreAuthorize）
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    // 默认所有请求都需要登录，对于这个后台管理系统来说，可以不改
	
	@Autowired
	private LoginAuthenticationSuccessHandler loginAuthenticationSuccessHandler;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests() 
			.antMatchers("/login", "/assets/css/**", "/assets/js/**","/assets/img/**","/assets/font/**").permitAll()
			.antMatchers("/**").authenticated() 

			.and()

			.sessionManagement() 
				.maximumSessions(1) 
				.sessionRegistry(sessionRegistry()) 
				.and()

			.and()

			.formLogin() 
			.loginPage("/login") 
			.defaultSuccessUrl("/")
			.successHandler(loginAuthenticationSuccessHandler)
			
			.and()
			
			.logout()
			.logoutSuccessHandler(logoutSuccessHandler());
		
	}
	
	@Bean
	public SessionRegistry sessionRegistry() {
		return new SessionRegistryImpl();
	}
	
	@Bean
	public LogoutSuccessHandler logoutSuccessHandler() {
		return new LogoutSuccessHandlerImpl();
	}

}
