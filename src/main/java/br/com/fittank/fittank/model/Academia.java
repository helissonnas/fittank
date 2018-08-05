package br.com.fittank.fittank.model;

import java.io.Serializable;
import java.util.ArrayList;
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
	private Integer id;

	@Column
	private String nome;
	
	@Embedded
	private Endereco endereco;
	
	@OneToMany(mappedBy = "academia", targetEntity = Usuario.class, 
			fetch = FetchType.LAZY, 
			cascade = CascadeType.ALL)
	private List<Usuario> usuarios = new ArrayList<>();
	
	@OneToMany(mappedBy = "academia", targetEntity = Aparelho.class, 
			fetch = FetchType.LAZY)
	private List<Aparelho> aparelhos = new ArrayList<>();
		
	public Academia() {
	
	}
	
	public Academia(Integer id, String nome, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
		Academia other = (Academia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Academia [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", usuarios=" + usuarios
				+ ", aparelhos=" + aparelhos + "]";
	}
}
