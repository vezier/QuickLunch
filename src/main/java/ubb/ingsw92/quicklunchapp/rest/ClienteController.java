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

import ubb.ingsw92.quicklunchapp.model.Cliente;
import ubb.ingsw92.quicklunchapp.model.Productos;
import ubb.ingsw92.quicklunchapp.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	@GetMapping("")
	public ResponseEntity<List<Cliente>> getAllCliente() {
		List<Cliente> clie = clienteService.getAllCliente();
		if(clie == null){
			return new ResponseEntity<List<Cliente>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Cliente>>(clie, HttpStatus.OK);
	}
	@GetMapping("/categoria/{id}")
	public ResponseEntity<List<Cliente>> getAllClientePorCat(@PathVariable int id) {
		List<Cliente> clie = clienteService.getAllClientePorCat(id);
		if(clie == null){
			return new ResponseEntity<List<Cliente>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Cliente>>(clie, HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getCliente(@PathVariable int id) {
		Optional<Cliente> clie1 = clienteService.getCliente(id);
		Cliente clie = clie1.get();
		if(clie == null){
			return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Cliente>(clie, HttpStatus.OK);			
	}
	@PostMapping(value="")
	public void addCliente(@RequestBody Cliente prod) {
		clienteService.addCliente(prod);
	}
	@PutMapping(value="/{id}")
	public void updateCliente(@RequestBody Cliente clie,@PathVariable int id) {
		clienteService.updateCliente(id, clie);
	}
	@DeleteMapping(value="/{id}")
	public void deleteProducto(@PathVariable int id) {
		clienteService.deleteCliente(id);
	}
}
