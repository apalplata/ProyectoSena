package co.com.amarie.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.amarie.models.entity.Empleado;
import co.com.amarie.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	@Autowired
	EmpleadoRepository empleadoRepository;

	@Override
	public Optional<Empleado> findById(Integer id) {
		return empleadoRepository.findById(id);
	}

	@Override
	public List<Empleado> findAll() {
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado save(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}

	@Override
	public void deleteById(Integer id) {
		empleadoRepository.deleteById(id);
		
	}
	
}
