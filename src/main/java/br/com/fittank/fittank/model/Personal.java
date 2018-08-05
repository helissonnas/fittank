package br.com.fittank.fittank.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Personal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1385829610467195806L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "fk_usuario", nullable = false)
	private Usuario usuario;
	
	@OneToMany(mappedBy = "personal", targetEntity = PlanoTreino.class, 
			fetch = FetchType.LAZY)
	private List<PlanoTreino> planoTreinos =  new ArrayList<>();
	
	public Personal() {
		
	}
	
	public Personal(Integer id, Usuario usuario) {
		super();
		this.id = id;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<PlanoTreino> getPlanoTreinos() {
		return planoTreinos;
	}

	public void setPlanoTreinos(List<PlanoTreino> planoTreinos) {
		this.planoTreinos = planoTreinos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personal other = (Personal) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Personal [id=" + id + ", usuario=" + usuario + ", planoTreinos=" + planoTreinos + "]";
	}
	
}
