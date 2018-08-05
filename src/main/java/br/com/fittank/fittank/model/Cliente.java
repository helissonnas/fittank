package br.com.fittank.fittank.model;

import java.io.Serializable;
import java.util.ArrayList;
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
	private Integer id;
		

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
		
	@ElementCollection
	@CollectionTable(name  = "objetivo", joinColumns = @JoinColumn(name = "id_cliente"))
	@Column
	private List<String> objetivos = new ArrayList<>();

	public Cliente() {
		
	}
	
	public Cliente(Integer id, Float peso, Float altura, Float massaMagra, Usuario usuario, PlanoTreino planoTreino) {
		this.id = id;
		this.peso = peso;
		this.altura = altura;
		this.massaMagra = massaMagra;
		this.usuario = usuario;
		this.planoTreino = planoTreino;
	}

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", peso=" + peso + ", altura=" + altura + ", massaMagra=" + massaMagra
				+ ", usuario=" + usuario + ", planoTreino=" + planoTreino + ", objetivos=" + objetivos + "]";
	}
}
