package ubb.ingsw92.quicklunchapp.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ubb.ingsw92.quicklunchapp.model.Pedido;
import ubb.ingsw92.quicklunchapp.repository.PedidoRepo;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepo pedidoRep;
	
	public List<Pedido> getAllPedido(){
		List<Pedido> pedido = new ArrayList<> ();
		pedidoRep.findAll()
		.forEach(pedido::add);
		return pedido;
	}
	public Optional<Pedido> getPedido (int id) {
	    return pedidoRep.findById(id);

	}
	public void addPedido(Pedido ped) {
		pedidoRep.save(ped);
	}
	public void updatePedido(int id, Pedido ped) {
		pedidoRep.save(ped);
			}
	public void deletePedido(int id) {
		pedidoRep.deleteById(id);
	}

	public void togglePedido(int id) {
		pedidoRep.toggleEstado(id);
	}
}
