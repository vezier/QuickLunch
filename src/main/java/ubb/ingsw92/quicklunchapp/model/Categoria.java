package ubb.ingsw92.quicklunchapp.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "categoria")
@Entity
public class Categoria {
	
	@Id
	@Column (name="id_categoria")
	private int idcategoria;
	private String categoria;
	private byte estado;
	public Categoria() {
	}



	public Categoria(int idcategoria, String categoria) {
		this.idcategoria = idcategoria;
		this.categoria = categoria;
		this.estado = 1;
	}



	public byte getEstado() {
		return estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	public int getId_categoria() {
		return idcategoria;
	}

	public void setId_categoria(int id_categoria) {
		this.idcategoria = id_categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	
}
