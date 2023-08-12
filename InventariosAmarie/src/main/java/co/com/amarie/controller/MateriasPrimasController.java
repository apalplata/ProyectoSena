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

import co.com.amarie.models.entity.MatPrimas;
import co.com.amarie.models.service.MatPrimasService;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RestController
@RequestMapping("/api/matprimas")
public class MateriasPrimasController {

	@Autowired
	MatPrimasService matPrimasService;
	
	@GetMapping("/{id}")
	public Optional<MatPrimas> buscarPorId(@PathVariable Integer id){
		return matPrimasService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<MatPrimas> listarTodos(){
		return matPrimasService.findAll();
	}
	
	@PostMapping
	public MatPrimas guardar(@RequestBody MatPrimas matPrimas) {
		return matPrimasService.save(matPrimas);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		matPrimasService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public MatPrimas actualizar(@RequestBody MatPrimas matPrimas, @PathVariable Integer id) {
		
		MatPrimas matPrimasDB = matPrimasService.findById(id).get();
		
		matPrimasDB.setNombre(matPrimas.getNombre());
		matPrimasDB.setCosto(matPrimas.getCosto());
		matPrimasDB.setExistencias(matPrimas.getExistencias());
		
		return matPrimasService.save(matPrimasDB);
	}
	
}
