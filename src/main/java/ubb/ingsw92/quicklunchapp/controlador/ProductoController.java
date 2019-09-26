package ubb.ingsw92.quicklunchapp.controlador;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ubb.ingsw92.quicklunchapp.modelo.Productos;
import ubb.ingsw92.quicklunchapp.servicio.ProductoService;



@RestController
public class ProductoController {
	@Autowired
	private ProductoService productoService;
	
	@RequestMapping("/productos")
	public List<Productos> getAllProductos() {
		return productoService.getAllProductos();
	}
	@RequestMapping("/productos/{id}")
	public Optional<Productos> getProducto(@PathVariable int id) {
		return productoService.getProducto(id);
	}
	@PostMapping(value="/productos")
	public void addProducto(@RequestBody Productos prod) {
		productoService.addProducto(prod);
	}
	@PutMapping(value="/productos/{id}")
	public void updateProducto(@RequestBody Productos prod,@PathVariable int id) {
		productoService.updateProducto(id, prod);
	}
	//@DeleteMapping(value="/productos/{id}")
	//public void deleteProducto(@PathVariable int id) {
	//	productoService.deleteProducto(id);
	//}
	@DeleteMapping(value="/productos/{id}")
	public void toggleProd(@PathVariable int id) {
		productoService.toggleProducto(id);
	}
}
