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

import co.com.amarie.models.entity.Compra;
import co.com.amarie.models.service.CompraService;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RestController
@RequestMapping("/api/compras")
public class CompraController {

	@Autowired
	CompraService compraService;
	
	@GetMapping("/{id}")
	public Optional<Compra> buscarPorId(@PathVariable Integer id){
		return compraService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Compra> listarTodos(){
		return compraService.findAll();
	}
	
	@PostMapping
	public Compra guardar(@RequestBody Compra compra) {
		return compraService.save(compra);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		compraService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Compra actualizar(@RequestBody Compra compra, @PathVariable Integer id) {
		
		Compra compraDB = compraService.findById(id).get();
		
		compraDB.setProveedor(compra.getProveedor());
		compraDB.setFechaHora(compra.getFechaHora());
		compraDB.setValor(compra.getValor());
		
		return compraService.save(compraDB);
	}
	
	
}
