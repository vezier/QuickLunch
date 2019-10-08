package ubb.ingsw92.quicklunchapp.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ubb.ingsw92.quicklunchapp.model.Boleta;
import ubb.ingsw92.quicklunchapp.model.Categoria;
import ubb.ingsw92.quicklunchapp.model.Productos;
import ubb.ingsw92.quicklunchapp.service.BoletaService;

@RestController
@RequestMapping("api/Boleta")
public class BoletaController {
	@Autowired
	BoletaService bolService;
	
	@GetMapping("")
	
	public List<Boleta> getAllBoleta() {
		return bolService.getAllBoletas();
	}
	@RequestMapping("/{id}")
	public Optional<Boleta> getBoleta(@PathVariable int id) {
		return bolService.getBoleta(id);
	}
	@PostMapping(value="")
	public void addBoleta(@RequestBody Boleta cat) {
		bolService.addBoleta(cat);
	}
	@PutMapping(value="/{id}")
	public void updateBoleta(@RequestBody Boleta cat,@PathVariable int id) {
		bolService.updateBoleta(id, cat);
	}
	@DeleteMapping(value="/{id}")
	public void deleteBoleta(@PathVariable int id) {
		bolService.deleteBoleta(id);
	}
	/*@PostMapping(value="/{id}")
	public void toggleBoleta(@PathVariable int id) {
		bolService.toggleBoleta(id);
	}*/
	
}