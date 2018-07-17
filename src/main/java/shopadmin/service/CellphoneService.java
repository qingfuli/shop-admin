package shopadmin.service;

import java.util.List;

import shopadmin.model.Cellphone;

public interface CellphoneService {

	List<Cellphone> findAll();

	void create(Cellphone cellphone);

	Cellphone findOne(Long id);

	void update(Cellphone cellphone);

	void delete(Long id);

	List<Cellphone> search(String brand, String os, String ramMin, String ramMax);
	
	
}
