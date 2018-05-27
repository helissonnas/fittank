package br.com.fittank.fittank.model;

import java.io.Serializable;
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
	private Long id;
	
	@OneToOne(mappedBy = "planoTreino")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "fk_personal")
	private Personal personal;

	@ManyToMany
	@JoinTable(name="plano_exercicio", joinColumns=
	      {@JoinColumn(name="plano_id")}, inverseJoinColumns=
      {@JoinColumn(name="exercicio_id")})
	private List<Exercicio> exercicio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
	
			
}
