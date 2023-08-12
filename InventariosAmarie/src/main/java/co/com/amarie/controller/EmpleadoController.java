package co.com.amarie.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.amarie.models.entity.Empleado;
import co.com.amarie.models.service.EmpleadoService;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {
	
	@Autowired
	EmpleadoService empleadoService;
	
	@GetMapping("/{id}")
	public Optional<Empleado> buscarPorId(@PathVariable Integer id){
		return empleadoService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Empleado> listarTodos(){
		return empleadoService.findAll();
	}
	
	@PostMapping
	public Empleado guardar(@RequestBody Empleado empleado) {
		return empleadoService.save(empleado);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		empleadoService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Empleado actualizar(@RequestBody Empleado empleado, @PathVariable Integer id) {
		
		Empleado empleadoBD = empleadoService.findById(id).get();
		
		empleadoBD.setNombre(empleado.getNombre());
		empleadoBD.setApellido(empleado.getApellido());
		empleadoBD.setDireccion(empleado.getDireccion());
		empleadoBD.setTelefono(empleado.getTelefono());
		
		return empleadoService.save(empleadoBD);
	}
	
}
