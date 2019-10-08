package ubb.ingsw92.quicklunchapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ubb.ingsw92.quicklunchapp.model.Cliente;
@Repository
@Transactional
public interface ClienteRepo extends CrudRepository<Cliente,Integer>{
	public List<Cliente> findByIdcategoria(int id);
	
}
