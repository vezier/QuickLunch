package ubb.ingsw92.quicklunchapp.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ubb.ingsw92.quicklunchapp.model.Pedido;
@Repository
@Transactional
public interface PedidoRepo extends CrudRepository<Pedido, Integer> {
	@Query(value ="UPDATE Pedido p SET p.estado =  CASE p.estado WHEN true then false ELSE true END WHERE p.id_pedido= :pId", nativeQuery=true)
	@Modifying(clearAutomatically = true)
    @Transactional
	void toggleEstado(@Param("pId") int id);
}
