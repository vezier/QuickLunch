package ubb.ingsw92.quicklunchapp.rest;

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

import ubb.ingsw92.quicklunchapp.model.Categoria;
import ubb.ingsw92.quicklunchapp.service.CategoriaService;
@RestController
@RequestMapping("api/categoria")
public class CategoriaController {
	@Autowired
	private CategoriaService catService;
	
	@RequestMapping("")
	public List<Categoria> getAllCategorias() {
		return catService.getAllCategorias();
	}
	@RequestMapping("/{id}")
	public Optional<Categoria> getCategoria(@PathVariable int id) {
		return catService.getCategoria(id);
	}
	@PostMapping(value="")
	public void addProducto(@RequestBody Categoria cat) {
		catService.addCategoria(cat);
	}
	@PutMapping(value="/{id}")
	public void updateProducto(@RequestBody Categoria cat,@PathVariable int id) {
		catService.updateCategoria(id, cat);
	}
	@DeleteMapping(value="/{id}")
	public void deleteProducto(@PathVariable int id) {
		catService.deleteCategoria(id);
	}

	}
