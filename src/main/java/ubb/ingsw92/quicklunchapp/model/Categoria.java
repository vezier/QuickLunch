package ubb.ingsw92.quicklunchapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "categoria")
@Entity
public class Categoria {
	
	@Id
	@Column (name="id_categoria")
	private int idcategoria;
	private String categoria;
	public Categoria() {
	}

	public Categoria(int id_categoria, String categoria) {
		super();
		this.idcategoria = id_categoria;
		this.categoria = categoria;
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
