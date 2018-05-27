package br.com.fittank.fittank.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Exercicio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2596053150211097827L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private Long nome;
	
	@Column(nullable = false)
	private Long duracao;
	
	@OneToOne
	@JoinColumn(name = "fk_aparelho", nullable = true)
	private Aparelho aparelho;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNome() {
		return nome;
	}

	public void setNome(Long nome) {
		this.nome = nome;
	}

	public Long getDuracao() {
		return duracao;
	}

	public void setDuracao(Long duracao) {
		this.duracao = duracao;
	}

	public Aparelho getAparelho() {
		return aparelho;
	}

	public void setAparelho(Aparelho aparelho) {
		this.aparelho = aparelho;
	}

}
