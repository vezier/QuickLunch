package ubb.ingsw92.quicklunchapp.repositorioJPA;
import ubb.ingsw92.quicklunchapp.modelo.Productos;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public interface ProductoRepo extends CrudRepository<Productos, Integer> {
	
	@Query(value ="UPDATE Productos p SET p.estado =  CASE p.estado WHEN true then false ELSE true END WHERE p.id_productos= :pId")
	@Modifying(clearAutomatically = true)
    @Transactional
	void toggleEstado(@Param("pId") int id);
}

