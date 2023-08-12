package co.com.amarie.models.service;

import java.util.List;
import java.util.Optional;

import co.com.amarie.models.entity.Empleado;

public interface EmpleadoService {
	
	public Optional<Empleado> findById(Integer id);
	public List<Empleado> findAll();
	public Empleado save(Empleado empleado);
	public void deleteById(Integer id);
}
