package shopadmin.mapper;

import java.util.List;

import javax.validation.Valid;

import org.apache.ibatis.annotations.Param;

import shopadmin.model.Operator;

public interface OperatorMapper {
	
	List<Operator> findAll();

	void create(Operator operator);

	Operator findOneByUsername(String username);

	void saveLoginTime(
			@Param("id") Long id, 
			@Param("loginTime") String loginTime);
	
}
