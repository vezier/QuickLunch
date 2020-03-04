package ubb.ingsw92.quicklunchapp.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ubb.ingsw92.quicklunchapp.model.Pedido;
import ubb.ingsw92.quicklunchapp.service.PedidoService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping("")
	public ResponseEntity<List<Pedido>> getAllPedido() {
		List<Pedido> ped = pedidoService.getAllPedido();
		if(ped == null){
			return new ResponseEntity<List<Pedido>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Pedido>>(ped, HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Pedido> getPedido(@PathVariable int id) {
		Optional<Pedido> ped1 = pedidoService.getPedido(id);
		Pedido ped = ped1.get();
		if(ped == null){
			return new ResponseEntity<Pedido>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Pedido>(ped, HttpStatus.OK);			
	}
	@PostMapping(value="")
	public void addPedido(@RequestBody Pedido ped) {
		pedidoService.addPedido(ped);
	}
	@PutMapping(value="/{id}")
	public void updatePedido(@RequestBody Pedido ped,@PathVariable int id) {
		pedidoService.updatePedido(id, ped);
	}

	@DeleteMapping(value="/{id}")
	public void deletePedido(@PathVariable int id) {
		pedidoService.deletePedido(id);
	}
	@DeleteMapping(value="/estado/{id}")
	public void togglePed(@PathVariable int id) {
		pedidoService.togglePedido(id);
	}
}
