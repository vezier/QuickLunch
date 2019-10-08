package ubb.ingsw92.quicklunchapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ubb.ingsw92.quicklunchapp.model.Boleta;
import ubb.ingsw92.quicklunchapp.model.Productos;
import ubb.ingsw92.quicklunchapp.repository.BoletaRepo;
import ubb.ingsw92.quicklunchapp.repository.ProductoRepo;
@Service
public class BoletaService {
	@Autowired
	private BoletaRepo BoletaRep;
	
	
	public List<Boleta> getAllBoletas(){
		List<Boleta> boleta = new ArrayList<> ();
		BoletaRep.findAll()
		.forEach(boleta::add);
		return boleta;
	}
	public Optional<Boleta> getBoleta (int id) {
	    return BoletaRep.findById(id);

	}
	public void addBoleta(Boleta bol) {
		BoletaRep.save(bol);
	}
	public void updateBoleta(int id, Boleta bol) {
		BoletaRep.save(bol);
	}
	public void deleteBoleta(int id) {
		BoletaRep.deleteById(id);
	}
	/*public void toggleBoleta (int id) {
		BoletaRep.toggleEstado(id);
	}*/

}