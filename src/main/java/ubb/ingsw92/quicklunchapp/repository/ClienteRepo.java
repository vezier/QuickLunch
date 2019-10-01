package ubb.ingsw92.quicklunchapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ubb.ingsw92.quicklunchapp.model.Cliente;
import ubb.ingsw92.quicklunchapp.model.Productos;
@Repository
public interface ClienteRepo extends CrudRepository<Cliente,Integer>{
	public List<Cliente> findByCategoriaCliente(int id);
	
}
