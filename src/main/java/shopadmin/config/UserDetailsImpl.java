package shopadmin.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import shopadmin.model.Operator;

public class UserDetailsImpl extends User{
	private Operator operator;

	public UserDetailsImpl(Operator operator) {
		super(operator.getUsername(), 
			  operator.getPassword(), 
			  true, 
			  true, 
			  true, 
			  true, 
			  buildAuthorities(operator)
			);
		this.operator = operator;
	}

	private static Collection<? extends GrantedAuthority> buildAuthorities(Operator operator2) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		return authorities;
	}

	public Operator getOperator() {
		return operator;
	}

	@Override
	public String toString() {
		return "UserDetailsImpl [operator=" + operator + ", getAuthorities()=" + getAuthorities() + ", getPassword()="
				+ getPassword() + ", getUsername()=" + getUsername() + ", isEnabled()=" + isEnabled()
				+ ", isAccountNonExpired()=" + isAccountNonExpired() + ", isAccountNonLocked()=" + isAccountNonLocked()
				+ ", isCredentialsNonExpired()=" + isCredentialsNonExpired() + "]";
	}
	
	

}
