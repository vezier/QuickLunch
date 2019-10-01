package ubb.ingsw92.quicklunchapp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "pedidos")
public class Pedido {
	   @Id
	   @Column (name="id_pedido")
       private int id_pedido;
       @Column (name="id_cliente")
       private int id_cliente;
       private Date fecha;
       private boolean estado;
    public Pedido() {
    	
    }
    public Pedido(int id_pedido, int id_cliente,Date fecha, boolean estado) {
		super();
		this.id_pedido=id_pedido;
		this.id_cliente = id_cliente;
		this.fecha=fecha;
		this.estado = estado;
	}
	public int getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
    	   
}
