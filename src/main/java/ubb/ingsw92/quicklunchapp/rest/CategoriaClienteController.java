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

import ubb.ingsw92.quicklunchapp.model.CategoriaCliente;
import ubb.ingsw92.quicklunchapp.service.CategoriaClienteService;
import ubb.ingsw92.quicklunchapp.service.ProductoService;



@RestController
@RequestMapping("/api/categoriacliente")
public class CategoriaClienteController {
	@Autowired
	private CategoriaClienteService ccService;
	
	@GetMapping("")
	public ResponseEntity<List<CategoriaCliente>> getAllCategorias() {
		List<CategoriaCliente> categoriasC = ccService.getAllCliente();
		if(categoriasC == null){
			return new ResponseEntity<List<CategoriaCliente>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<CategoriaCliente>>(categoriasC, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CategoriaCliente> getProducto(@PathVariable int id) {
		Optional<CategoriaCliente> categoriaC1 = ccService.getcategoria_cliente(id);
		CategoriaCliente categoriaC = categoriaC1.get();
		if(categoriaC == null){
			return new ResponseEntity<CategoriaCliente>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<CategoriaCliente>(categoriaC, HttpStatus.OK);			
	}
	
	@PostMapping(value="")
	public void addCategoria(@RequestBody CategoriaCliente categoria) {
		ccService.addcategoria_cliente(categoria);
	}
	@PutMapping(value="/{id}")
	public void updateCategoriaCliente(@RequestBody CategoriaCliente cat,@PathVariable int id) {
		ccService.updatecategoria_cliente(id, cat);
	}
	@DeleteMapping(value="/{id}")
	public void deleteProducto(@PathVariable int id) {
		ccService.deletecategoria_cliente(id);
	}


}
