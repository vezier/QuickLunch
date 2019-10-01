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

import ubb.ingsw92.quicklunchapp.model.categoria_cliente;
import ubb.ingsw92.quicklunchapp.service.categoria_clienteService;
@RestController
@RequestMapping("api/categoria_cliente")
public class categoria_clienteController {
	@Autowired
	private categoria_clienteService catService;
	
	@RequestMapping("")
	public List<categoria_cliente> getAllCategorias() {
		return catService.getAllCategorias();
	}
	@RequestMapping("/{id}")
	public Optional<categoria_cliente> getcategoria_cliente(@PathVariable int id) {
		return catService.getcategoria_cliente(id);
	}
	@PostMapping(value="")
	public void addCliente(@RequestBody categoria_cliente cat) {
		catService.addcategoria_cliente(cat);
	}
	@PutMapping(value="/{id}")
	public void updateCliente(@RequestBody categoria_cliente cat,@PathVariable int id) {
		catService.updatecategoria_cliente(id, cat);
	}
	@DeleteMapping(value="/{id}")
	public void deleteCliente(@PathVariable int id) {
		catService.deletecategoria_cliente(id);
	}

}
