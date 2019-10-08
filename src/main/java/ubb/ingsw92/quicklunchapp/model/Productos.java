package ubb.ingsw92.quicklunchapp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "producto")
public class Productos {
	@Id
	@Column (name="id_producto")
	private int idProductos;
	private String nombre;
	private int precio;
	@Column (name="id_categoria")
	private int idcategoria;
	private String descripcion;
	@Column (name="stock_minimo")
	private int stockminimo;
	@Column (name="stock_maximo")
	private int stockmaximo;
	private byte estado;
	@ManyToMany (mappedBy="productos")
	private List<Pedido> pedidos;
	
	public Productos() {

	}


	public Productos(int id_productos, String nombre, int precio, int id_categoria, String descripcion,
			int stock_minimo, int stock_maximo, byte estado) {
		this.idProductos = id_productos;
		this.nombre = nombre;
		this.precio = precio;
		this.idcategoria = id_categoria;
		this.descripcion = descripcion;
		this.stockminimo = stock_minimo;
		this.stockmaximo = stock_maximo;
		this.estado = estado;
	}


	public int getIdProductos() {
		return idProductos;
	}


	public void setIdProductos(int idProductos) {
		this.idProductos = idProductos;
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


	public int getCategoria() {
		return idcategoria;
	}


	public void setCategoria(int categoria) {
		this.idcategoria = categoria;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getStockminimo() {
		return stockminimo;
	}


	public void setStockminimo(int stockminimo) {
		this.stockminimo = stockminimo;
	}


	public int getStockmaximo() {
		return stockmaximo;
	}


	public void setStockmaximo(int stockmaximo) {
		this.stockmaximo = stockmaximo;
	}


	public byte getEstado() {
		return estado;
	}


	public void setEstado(byte estado) {
		this.estado = estado;
	}

	
}
