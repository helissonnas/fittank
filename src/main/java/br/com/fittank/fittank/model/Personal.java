package br.com.fittank.fittank.model;

import java.io.Serializable;
import java.util.List;

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
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "fk_usuario", nullable = false)
	private Usuario usuario;
	
	@OneToMany(mappedBy = "personal", targetEntity = PlanoTreino.class, 
			fetch = FetchType.LAZY)
	private List<PlanoTreino> planoTreinos;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
	
}
