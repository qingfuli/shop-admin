package shopadmin.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import shopadmin.mapper.OperatorMapper;
import shopadmin.model.Operator;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	private OperatorMapper operatorMapper;
	
	@Autowired
	public UserDetailsServiceImpl(OperatorMapper operatorMapper) {
		this.operatorMapper = operatorMapper;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Operator operator = operatorMapper.findOneByUsername(username);
		
		if (operator == null) {
            throw new UsernameNotFoundException("用户名不存在: " + username);
        } 
		
		System.out.println("111111111111111111111111111");
        
        return new UserDetailsImpl(operator);
	}

}
