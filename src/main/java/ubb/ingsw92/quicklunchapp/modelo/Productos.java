package ubb.ingsw92.quicklunchapp.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Table(name = "productos")
@Entity
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_productos;
	private String nombre;
	private int precio;
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria id_categoria;
	private String descripcion;
	private int stock_minimo;
	private int stock_maximo;
	private boolean estado;
		
	
	public Productos() {
	}

	

	public int getId_producto() {
		return id_productos;
	}
	public void setId_producto(int id_producto) {
		this.id_productos = id_producto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getId_categoria() {
		return id_categoria.getId_categoria();
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria.setId_categoria(id_categoria);
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getStock_minimo() {
		return stock_minimo;
	}
	public void setStock_minimo(int stock_minimo) {
		this.stock_minimo = stock_minimo;
	}
	public int getStock_maximo() {
		return stock_maximo;
	}
	public void setStock_maximo(int stock_maximo) {
		this.stock_maximo = stock_maximo;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	

}
