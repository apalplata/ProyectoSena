package co.com.amarie.models.service;

import java.util.List;
import java.util.Optional;

import co.com.amarie.models.entity.Compra;

public interface CompraService {

	public Optional<Compra> findById(Integer id);
	public List<Compra> findAll();
	public Compra save(Compra compra);
	public void deleteById(Integer id);
	
}
