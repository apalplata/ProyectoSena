package co.com.amarie.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.amarie.models.entity.Compra;
import co.com.amarie.repository.CompraRepository;


@Service
public class CompraServiceImpl implements CompraService {

	@Autowired
	CompraRepository compraRepository;

	@Override
	public Optional<Compra> findById(Integer id) {
		return compraRepository.findById(id);
	}

	@Override
	public List<Compra> findAll() {
		return compraRepository.findAll();
	}

	@Override
	public Compra save(Compra compra) {
		return compraRepository.save(compra);
	}

	@Override
	public void deleteById(Integer id) {
		compraRepository.deleteById(id);
		
	}
}
