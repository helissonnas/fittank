package br.com.fittank.fittank.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Academia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8888285697541989980L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String nome;
	
	@Embedded
	private Endereco endereco;
	
	@OneToMany(mappedBy = "academia", targetEntity = Usuario.class, 
			fetch = FetchType.LAZY, 
			cascade = CascadeType.ALL)
	private List<Usuario> usuarios;
	
	@OneToMany(mappedBy = "academia", targetEntity = Aparelho.class, 
			fetch = FetchType.LAZY)
	private List<Aparelho> aparelhos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Aparelho> getAparelhos() {
		return aparelhos;
	}

	public void setAparelhos(List<Aparelho> aparelhos) {
		this.aparelhos = aparelhos;
	}	
	
}
