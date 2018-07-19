package shopadmin.config;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import shopadmin.mapper.OperatorMapper;

@Component
public class LoginAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{

	private OperatorMapper operatorMapper;

	@Autowired
	public LoginAuthenticationSuccessHandler(OperatorMapper operatorMapper) {
		this.operatorMapper = operatorMapper;
	}
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		super.onAuthenticationSuccess(request, response, authentication);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		UserDetailsImpl userDetailsImpl = (UserDetailsImpl)authentication.getPrincipal();
		Long id = userDetailsImpl.getOperator().getId();
		operatorMapper.saveLoginTime(id, df.format(new Date()));
	}
}
