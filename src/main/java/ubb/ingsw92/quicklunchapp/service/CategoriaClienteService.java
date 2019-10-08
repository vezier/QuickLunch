package ubb.ingsw92.quicklunchapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ubb.ingsw92.quicklunchapp.model.CategoriaCliente;
import ubb.ingsw92.quicklunchapp.repository.CategoriaClienteRepo;

@Service
public class CategoriaClienteService {
	@Autowired
	private CategoriaClienteRepo catRepo;
	
	public List<CategoriaCliente> getAllCliente(){
		List<CategoriaCliente> cat_cliente = new ArrayList<> ();
		catRepo.findAll()
		.forEach(cat_cliente::add);
		return cat_cliente;
	}
	public Optional<CategoriaCliente> getcategoria_cliente (int id) {
	    return catRepo.findById(id);
	}
	public void addcategoria_cliente (CategoriaCliente cat) {
		catRepo.save(cat);
	}
	public void updatecategoria_cliente (int id, CategoriaCliente cat) {
		catRepo.save(cat);
			}
	public void deletecategoria_cliente(int id) {
		catRepo.deleteById(id);
	}

}
