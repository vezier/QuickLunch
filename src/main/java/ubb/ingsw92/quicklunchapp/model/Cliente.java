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
	private int id_cliente;
	private String Rut;
	private String Nombre;
	private int montoCompra;
	@Column (name="idcategoriaCliente")	
	private int idcategoriaCliente;
	public Cliente() {
		
	}
	public Cliente(int id,String rut,String nombre,int montoc,int idcarCli) {
		super();
		this.id_cliente=id;
		this.Rut=rut;
		this.Nombre=nombre;
		this.montoCompra=montoc;
		this.idcategoriaCliente=idcarCli;
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
		return idcategoriaCliente;
	}
	public void setIdcategoriaCliente(int idcategoriaCliente) {
		this.idcategoriaCliente = idcategoriaCliente;
	}
	public int getId_cliente() {
		return this.id_cliente;
	}
	public void setID_cliente(int id) {
		this.id_cliente = id;
	}
	public String getRut() {
		return Rut;
	}
	public void setRut(String rut) {
		Rut = rut;
	}
	
	
	
}
