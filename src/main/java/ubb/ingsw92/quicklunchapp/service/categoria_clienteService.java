package ubb.ingsw92.quicklunchapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import ubb.ingsw92.quicklunchapp.model.categoria_cliente;
import ubb.ingsw92.quicklunchapp.repository.categoria_clienteRepo;

public class categoria_clienteService {
	@Autowired
	private categoria_clienteRepo categoria_clienteRep;
	public List<categoria_cliente> getAllCategorias(){
		List<categoria_cliente> categoria_cliente = new ArrayList<> ();
		categoria_clienteRep.findAll()
		.forEach(categoria_cliente::add);
		return categoria_cliente;
	}
	public Optional<categoria_cliente> getcategoria_cliente (int id) {
	    return categoria_clienteRep.findById(id);

	}
	public void addcategoria_cliente (categoria_cliente cat) {
		categoria_clienteRep.save(cat);
	}
	public void updatecategoria_cliente (int id, categoria_cliente cat) {
		categoria_clienteRep.save(cat);
			}
	public void deletecategoria_cliente(int id) {
		categoria_clienteRep.deleteById(id);
	}

}
