package br.com.fittank.fittank.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class PlanoTreino implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5158395539165780708L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@OneToOne(mappedBy = "planoTreino")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "fk_personal")
	private Personal personal;

	@ManyToMany
	@JoinTable(name="plano_exercicio", joinColumns=
	      {@JoinColumn(name="plano_id")}, inverseJoinColumns=
      {@JoinColumn(name="exercicio_id")})
	private List<Exercicio> exercicio = new ArrayList<>();

	public PlanoTreino() {
		
	}
	
	public PlanoTreino(Integer id, Cliente cliente, Personal personal) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.personal = personal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Personal getPersonal() {
		return personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	public List<Exercicio> getExercicio() {
		return exercicio;
	}

	public void setExercicio(List<Exercicio> exercicio) {
		this.exercicio = exercicio;
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
		PlanoTreino other = (PlanoTreino) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlanoTreino [id=" + id + ", cliente=" + cliente + ", personal=" + personal + ", exercicio=" + exercicio
				+ "]";
	}
			
}
