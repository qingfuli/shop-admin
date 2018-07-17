package shopadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopadmin.mapper.CellphoneMapper;
import shopadmin.model.Cellphone;
import shopadmin.service.CellphoneService;

@Service
public class CellphoneServiceImpl implements CellphoneService{
	private CellphoneMapper cellphoneMapper;
	
	@Autowired
	public CellphoneServiceImpl(CellphoneMapper cellphoneMapper) {
		this.cellphoneMapper = cellphoneMapper;
	}

	@Override
	public List<Cellphone> findAll() {
		return cellphoneMapper.findAll();
	}

	@Override
	public void create(Cellphone cellphone) {
		cellphoneMapper.create(cellphone);		
	}

	@Override
	public Cellphone findOne(Long id) {
		return cellphoneMapper.findOne(id);
	}

	@Override
	public void update(Cellphone cellphone) {
		cellphoneMapper.update(cellphone);
	}

	@Override
	public void delete(Long id) {
		cellphoneMapper.delete(id);
	}

	@Override
	public List<Cellphone> search(String brand, String os, String ramMin, String ramMax) {
		return cellphoneMapper.search(brand, os, ramMin, ramMax);
	}

}
