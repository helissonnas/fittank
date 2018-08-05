package br.com.fittank.fittank.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Aparelho implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4622968671320522353L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private Integer numeroSerie;
	
	@Column
	private String modelo;
	
	@Column(nullable = false)
	private boolean ocupado;
	
	@ManyToOne
	@JoinColumn(name = "fk_academia")
	private Academia academia;

	public Aparelho() {

	}
	
	public Aparelho(Integer id, Integer numeroSerie, String modelo, boolean ocupado, Academia academia) {
		this.id = id;
		this.numeroSerie = numeroSerie;
		this.modelo = modelo;
		this.ocupado = ocupado;
		this.academia = academia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(Integer numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public Academia getAcademia() {
		return academia;
	}

	public void setAcademia(Academia academia) {
		this.academia = academia;
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
		Aparelho other = (Aparelho) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aparelho [id=" + id + ", numeroSerie=" + numeroSerie + ", modelo=" + modelo + ", ocupado=" + ocupado
				+ ", academia=" + academia + "]";
	}	
}
