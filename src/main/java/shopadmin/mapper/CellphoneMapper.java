package shopadmin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import shopadmin.model.Cellphone;

public interface CellphoneMapper {
	
	List<Cellphone> findAll();
	
	Cellphone findOne(Long id);
	
	void create(Cellphone cellphone);
	
	void update(Cellphone cellphone);
	
	void delete(Long id);

	List<Cellphone> search(
			@Param("brand") String brand, 
			@Param("os") String os, 
			@Param("ramMin") String ramMin, 
			@Param("ramMax") String ramMax
			);
	
}
