package ubb.ingsw92.quicklunchapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Cliente") 
public class Cliente {
	@Id
	@Column (name="id_cliente")
	private int idcliente;
	private String Rut;
	private String Nombre;
	@Column (name="monto_compra")
	private int montoCompra;
	@Column (name="id_catergoria_cliente")	
	private int idcategoria;
	public Cliente() {
		
	}
	public Cliente(int id,String rut,String nombre,int montoc,int idcarCli) {
		this.idcliente=id;
		this.Rut=rut;
		this.Nombre=nombre;
		this.montoCompra=montoc;
		this.idcategoria=idcarCli;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getRut() {
		return Rut;
	}
	public void setRut(String rut) {
		Rut = rut;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getMontoCompra() {
		return montoCompra;
	}
	public void setMontoCompra(int montoCompra) {
		this.montoCompra = montoCompra;
	}
	public int getIdcategoriaCliente() {
		return idcategoria;
	}
	public void setIdcategoriaCliente(int idcategoriaCliente) {
		this.idcategoria = idcategoriaCliente;
	}
	
}
