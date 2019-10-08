package ubb.ingsw92.quicklunchapp.model;

import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Table(name = "boleta")
@Entity
public class Boleta{
	@Id
	@Column (name="id_boleta")
	private int id_boleta;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn (name="id_pedido", referencedColumnName ="id_pedido")
	private Pedido pedido;
	private Date fecha;
	private int total_pagar;
    private int forma_pago;
    private int estado;
    
    public Boleta(int id_boleta, int id_pedido, Date fecha, int total_pagar, int forma_pago, 
    		int estado ) {
    this.id_boleta=id_boleta;
    //this.pedido=new Pedido();//Completar
    this.fecha=fecha;
    this.total_pagar=total_pagar;
    this.forma_pago=forma_pago;
    this.estado=estado; 
    }
    
    public int getId_boleta() {
		return id_boleta;
	}
	public void setId_boleta(int id_boleta) {
		this.id_boleta = id_boleta;
	}
	public Pedido getPedido() {
			return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getTotal_pagar() {
		return total_pagar;
	}
	public void setTotal_pagar(int total_pagar) {
		this.total_pagar = total_pagar;
	}
	public int getForma_pago() {
		return forma_pago;
	}
	public void setForma_pago(int forma_pago) {
		this.forma_pago = forma_pago;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado=estado;
	}
  
}