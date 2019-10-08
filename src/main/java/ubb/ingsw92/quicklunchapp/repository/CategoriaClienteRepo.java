package ubb.ingsw92.quicklunchapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ubb.ingsw92.quicklunchapp.model.CategoriaCliente;
@Repository
@Transactional
public interface CategoriaClienteRepo extends CrudRepository<CategoriaCliente, Integer>{
     
} 
