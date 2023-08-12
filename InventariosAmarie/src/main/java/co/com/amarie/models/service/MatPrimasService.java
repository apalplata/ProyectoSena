package co.com.amarie.models.service;

import java.util.List;
import java.util.Optional;

import co.com.amarie.models.entity.MatPrimas;

public interface MatPrimasService {

	public Optional<MatPrimas> findById(Integer id);
	public List<MatPrimas> findAll();
	public MatPrimas save(MatPrimas matPrimas);
	public void deleteById(Integer id);
	
}
