package shopadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import shopadmin.mapper.OperatorMapper;
import shopadmin.model.Operator;
import shopadmin.service.OperatorService;

@Service
public class OperatorServiceImpl implements OperatorService{
	private OperatorMapper operatorMapper;
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	public OperatorServiceImpl(OperatorMapper operatorMapper, PasswordEncoder passwordEncoder) {
		this.operatorMapper = operatorMapper;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public List<Operator> findAll() {
		return operatorMapper.findAll();
	}

	@Override
	public void create(Operator operator) {
		
		String encodedPassword = passwordEncoder.encode(operator.getPassword());
	    operator.setPassword(encodedPassword);
		operatorMapper.create(operator);
	}

}
