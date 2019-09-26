package ubb.ingsw92.quicklunchapp.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Table(name = "categoria")
@Entity
public class Categoria {
	
	@Id
	private int id_categoria;
	private String categoria;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "id_categoria")
	private List<Productos> productos;
	public Categoria() {
	}

	public Categoria(int id_categoria, String categoria) {
		super();
		this.id_categoria = id_categoria;
		this.categoria = categoria;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	
}
