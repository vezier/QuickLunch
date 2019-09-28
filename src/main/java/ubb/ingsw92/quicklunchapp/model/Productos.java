package ubb.ingsw92.quicklunchapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "productos")
@Entity
public class Productos {
	@Id
	@Column (name="id_productos")
	private int idproductos;
	private String nombre;
	private int precio;
	@Column (name="id_categoria")
	private int id_categoria;
	private String descripcion;
	@Column (name="stock_minimo")
	private int stockminimo;
	@Column (name="stock_maximo")
	private int stockmaximo;
	private boolean estado;
		
	
	public Productos(int id_productos, String nombre, int precio, int id_categoria, String descripcion,
			int stock_minimo, int stock_maximo, boolean estado) {
		super();
		this.idproductos = id_productos;
		this.nombre = nombre;
		this.precio = precio;
		this.id_categoria = id_categoria;
		this.descripcion = descripcion;
		this.stockminimo = stock_minimo;
		this.stockmaximo = stock_maximo;
		this.estado = estado;
	}


	public Productos() {
	}


	public int getId_productos() {
		return idproductos;
	}


	public void setId_productos(int id_productos) {
		this.idproductos = id_productos;
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
		return id_categoria;
	}


	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getStock_minimo() {
		return stockminimo;
	}


	public void setStock_minimo(int stock_minimo) {
		this.stockminimo = stock_minimo;
	}


	public int getStock_maximo() {
		return stockmaximo;
	}


	public void setStock_maximo(int stock_maximo) {
		this.stockmaximo = stock_maximo;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
	

}
