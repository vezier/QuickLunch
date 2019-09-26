package ubb.ingsw92.quicklunchapp.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ubb.ingsw92.quicklunchapp.modelo.Categoria;
import ubb.ingsw92.quicklunchapp.repositorioJPA.CategoriaRepo;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepo categoriaRep;
	
	public List<Categoria> getAllCategorias(){
		List<Categoria> categorias = new ArrayList<> ();
		categoriaRep.findAll()
		.forEach(categorias::add);
		return categorias;
	}
	public Optional<Categoria> getCategoria (int id) {
	    return categoriaRep.findById(id);

	}
	public void addCategoria (Categoria cat) {
		categoriaRep.save(cat);
	}
	public void updateCategoria (int id, Categoria cat) {
		categoriaRep.save(cat);
			}
	public void deleteCategoria(int id) {
		categoriaRep.deleteById(id);
	}

}
