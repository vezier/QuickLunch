package ubb.ingsw92.quicklunchapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "categoria_cliente ")
@Entity
public class categoria_cliente {
	@Id
	@Column (name="id_categoria_cliente")
	private int idcategoriaCliente;
	private String nombreCategoria;
	private int monto;
	private float porcentaje;
	public categoria_cliente () {
	}

	public categoria_cliente (int id_categoria, String newnombreCategoria,int monto ,float porcentaje) {
		super();
		this.idcategoriaCliente = id_categoria;
		this.nombreCategoria=newnombreCategoria;
		this.monto=monto;
		this.porcentaje=porcentaje;
	}

	public int getId_categoriaCliente() {
		return idcategoriaCliente;
	}

	public void setId_categoria(int newidcategoriaCliente) {
		this.idcategoriaCliente = newidcategoriaCliente;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	
}
