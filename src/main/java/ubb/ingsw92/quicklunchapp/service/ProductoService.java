package ubb.ingsw92.quicklunchapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ubb.ingsw92.quicklunchapp.model.Productos;
import ubb.ingsw92.quicklunchapp.repository.ProductoRepo;

@Service
public class ProductoService {
	@Autowired
	private ProductoRepo productoRep;
	
	public List<Productos> getAllProductos(){
		List<Productos> productos = new ArrayList<> ();
		productoRep.findAll()
		.forEach(productos::add);
		return productos;
	}
	public List<Productos> getAllProductosPorCat(int id){
		List<Productos> productos = new ArrayList<> ();
		productoRep.findByIdcategoria(id)
		.forEach(productos::add);
		return productos;
	}
	public Optional<Productos> getProducto (int id) {
	    return productoRep.findById(id);

	}
	public void addProducto(Productos prod) {
		productoRep.save(prod);
	}
	public void updateProducto(int id, Productos prod) {
		productoRep.save(prod);
			}
	public void deleteProducto(int id) {
		productoRep.deleteById(id);
	}
	public void toggleProducto (int id) {
		productoRep.toggleEstado(id);
	}

}
