package shopadmin.service;

import java.util.List;

import javax.validation.Valid;

import shopadmin.model.Cellphone;
import shopadmin.model.Operator;

public interface OperatorService {

	List<Operator> findAll();

	void create(Operator operator);
	
}
