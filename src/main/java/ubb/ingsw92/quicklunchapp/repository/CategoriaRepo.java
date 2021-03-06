package ubb.ingsw92.quicklunchapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ubb.ingsw92.quicklunchapp.model.Categoria;
@Repository
@Transactional
public interface CategoriaRepo extends CrudRepository<Categoria, Integer>{

}
