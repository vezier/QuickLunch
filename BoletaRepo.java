package ubb.ingsw92.quicklunchapp.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ubb.ingsw92.quicklunchapp.model.Boleta;
import ubb.ingsw92.quicklunchapp.model.Categoria;
import java.util.List;

@Repository
public interface BoletaRepo extends CrudRepository<Boleta, Integer>{
	/*@Query(value ="UPDATE Boleta b SET b.estado =  CASE b.estado WHEN true then false ELSE true END WHERE b.id_boleta= :pId", nativeQuery=true)
	@Modifying(clearAutomatically = true)
    @Transactional
	void toggleEstado(@Param("pId") int id);*/
}