package ubb.ingsw92.quicklunchapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ubb.ingsw92.quicklunchapp.model.Cliente;
import ubb.ingsw92.quicklunchapp.model.Productos;
import ubb.ingsw92.quicklunchapp.repository.ClienteRepo;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepo clienteRep;
	
	public List<Cliente> getAllCliente(){
		List<Cliente> cliente = new ArrayList<> ();
		clienteRep.findAll()
		.forEach(cliente::add);
		return cliente;
	}
	public List<Cliente> getAllClientePorCat(int id){
		List<Cliente> cliente = new ArrayList<> ();
		clienteRep.findByIdcategoria(id)
		.forEach(cliente::add);
		return cliente;
	}
	public Optional<Cliente> getCliente (int id) {
	    return clienteRep.findById(id);
	}
	public void addCliente(Cliente cli) {
		clienteRep.save(cli);
	}
	public void updateCliente(int id, Cliente cli) {
		clienteRep.save(cli);
			}
	public void deleteCliente(int id) {
		clienteRep.deleteById(id);
	}
}
