package br.com.fittank.fittank.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1860173468368018128L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
		
	@ElementCollection
	@CollectionTable(name  = "objetivo", joinColumns = @JoinColumn(name = "id_cliente"))
	@Column
	private List<String> objetivos;

	@Column
	private Float peso;
	
	@Column
	private Float altura;
	
	@Column
	private Float massaMagra;

	@OneToOne
	@JoinColumn(name = "fk_usuario", nullable = false)
	private Usuario usuario;
	
	@OneToOne
	@JoinColumn(name = "fk_plano_treino", nullable = false)
	private PlanoTreino planoTreino;
		
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public PlanoTreino getPlanoTreino() {
		return planoTreino;
	}

	public void setPlanoTreino(PlanoTreino planoTreino) {
		this.planoTreino = planoTreino;
	}

	public List<String> getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(List<String> objetivos) {
		this.objetivos = objetivos;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Float getMassaMagra() {
		return massaMagra;
	}

	public void setMassaMagra(Float massaMagra) {
		this.massaMagra = massaMagra;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
