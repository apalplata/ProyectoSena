package co.com.amarie.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.amarie.models.entity.MatPrimas;
import co.com.amarie.repository.MatPrimasRepository;

@Service
public class MatPrimasServiceImpl implements MatPrimasService {

	@Autowired
	MatPrimasRepository matPrimasRepository;

	@Override
	public Optional<MatPrimas> findById(Integer id) {
		return matPrimasRepository.findById(id);
	}

	@Override
	public List<MatPrimas> findAll() {
		return matPrimasRepository.findAll();
	}

	@Override
	public MatPrimas save(MatPrimas matPrimas) {
		return matPrimasRepository.save(matPrimas);
	}

	@Override
	public void deleteById(Integer id) {
		matPrimasRepository.deleteById(id);
		
	}
	
}
