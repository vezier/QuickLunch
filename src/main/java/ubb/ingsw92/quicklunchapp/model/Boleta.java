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
	private int idboleta;
	@Column (name="id_pedido")
	private int idpedido;
	private Date fecha;
	private int total_pagar;
    private int forma_pago;
    
	public Boleta() {

	}
    public Boleta(int id_boleta, int id_pedido, Date fecha, int total_pagar, int forma_pago) {
    this.idboleta=id_boleta;
    this.idpedido=id_pedido;
    this.fecha=fecha;
    this.total_pagar=total_pagar;
    this.forma_pago=forma_pago;
  
    }
    
    public int getId_boleta() {
		return idboleta;
	}
	public void setId_boleta(int id_boleta) {
		this.idboleta = id_boleta;
	}

	public int getPedido() {
		return idpedido;
	}
	public void setPedido(int pedido) {
		this.idpedido = pedido;
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

  
}