package ubb.ingsw92.quicklunchapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "categoria_cliente ")
public class CategoriaCliente {
	
	@Id
	@NotNull
	@Column(name="id_categoria_cliente",unique = true)
	private int idcat;
	private String nombreCategoria;
	private int monto;
	private float porcentaje;
	
	public CategoriaCliente () {
	}

	public CategoriaCliente (int id_cat, String newnombreCategoria,int monto ,float porcentaje) {

		this.idcat = id_cat;
		this.nombreCategoria=newnombreCategoria;
		this.monto=monto;
		this.porcentaje=porcentaje;
	}

	public int getIdcategoriacliente() {
		return idcat;
	}

	public void setIdcategoriacliente(int idcategoriacliente) {
		this.idcat = idcategoriacliente;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}

	
	
}
