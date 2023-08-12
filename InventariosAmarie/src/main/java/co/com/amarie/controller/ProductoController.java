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

import co.com.amarie.models.entity.Producto;
import co.com.amarie.models.service.ProductoService;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RestController
@RequestMapping("/api/productos")
public class ProductoController {

	@Autowired
	ProductoService productoService;
	
	@GetMapping("/{id}")
	public Optional<Producto> buscarPorId(@PathVariable Integer id){
		return productoService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Producto> listarTodos(){
		return productoService.findAll();
	}
	
	@PostMapping
	public Producto guardar(@RequestBody Producto producto) {
		return productoService.save(producto);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		productoService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Producto actualizar(@RequestBody Producto producto, @PathVariable Integer id) {
		
		Producto productoBD = productoService.findById(id).get();
		
		productoBD.setNombre(producto.getNombre());
		productoBD.setExistencias(producto.getExistencias());
		productoBD.setPrecioCompra(producto.getPrecioCompra());
		productoBD.setPrecioVenta(producto.getPrecioVenta());
				
		return productoService.save(productoBD);
	}
	
}
