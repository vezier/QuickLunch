package ubb.ingsw92.quicklunchapp.rest;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ubb.ingsw92.quicklunchapp.model.Productos;
import ubb.ingsw92.quicklunchapp.service.ProductoService;



@RestController
@RequestMapping("/api/productos")
public class ProductoController {
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("")
	public ResponseEntity<List<Productos>> getAllProductos() {
		List<Productos> prod = productoService.getAllProductos();
		if(prod == null){
			return new ResponseEntity<List<Productos>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Productos>>(prod, HttpStatus.OK);
	}
	@GetMapping("/categoria/{id}")
	public ResponseEntity<List<Productos>> getAllProductosPorCat(@PathVariable int id) {
		List<Productos> prod = productoService.getAllProductosPorCat(id);
		if(prod == null){
			return new ResponseEntity<List<Productos>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Productos>>(prod, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Productos> getProducto(@PathVariable int id) {
		Optional<Productos> prod1 = productoService.getProducto(id);
		Productos prod = prod1.get();
		if(prod == null){
			return new ResponseEntity<Productos>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Productos>(prod, HttpStatus.OK);			
	}
	@PostMapping(value="")
	public void addProducto(@RequestBody Productos prod) {
		productoService.addProducto(prod);
	}
	@PutMapping(value="/{id}")
	public void updateProducto(@RequestBody Productos prod,@PathVariable int id) {
		productoService.updateProducto(id, prod);
	}
	@DeleteMapping(value="/{id}")
	public void deleteProducto(@PathVariable int id) {
		productoService.deleteProducto(id);
	}
	@PostMapping(value="/{id}")
	public void toggleProd(@PathVariable int id) {
		productoService.toggleProducto(id);
	}

}
