package br.com.fittank.fittank.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private Long nome;
	
	@Column(nullable = false)
	private Long duracao;
	
	@OneToOne
	@JoinColumn(name = "fk_aparelho", nullable = true)
	private Aparelho aparelho;

	public Exercicio() {
		
	}
	
	public Exercicio(Long id, Long nome, Long duracao, Aparelho aparelho) {
		super();
		this.id = id;
		this.nome = nome;
		this.duracao = duracao;
		this.aparelho = aparelho;
	}

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
		Exercicio other = (Exercicio) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Exercicio [id=" + id + ", nome=" + nome + ", duracao=" + duracao + ", aparelho=" + aparelho + "]";
	}
}
