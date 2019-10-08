package ubb.ingsw92.quicklunchapp.model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "pedido")
public class Pedido {
	   @Id
	   @Column (name="id_pedido")
       private int idpedido;
       @Column (name="id_cliente")
       private int idcliente;
       private LocalDateTime fecha;
       private byte estado;
       
       @ManyToMany
       private List<Productos> productos;
       
       
    public Pedido() {
    	
    }
    public Pedido(int id_pedido, int id_cliente,LocalDateTime fecha, byte estado) {
		this.idpedido=id_pedido;
		this.idcliente = id_cliente;
		this.fecha=fecha;
		this.estado = estado;
	}
	public int getId_pedido() {
		return idpedido;
	}
	public void setId_pedido(int id_pedido) {
		this.idpedido = id_pedido;
	}
	public int getId_cliente() {
		return idcliente;
	}
	public void setId_cliente(int id_cliente) {
		this.idcliente = id_cliente;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public byte isEstado() {
		return estado;
	}
	public void setEstado(byte estado) {
		this.estado = estado;
	}
    	   
}
