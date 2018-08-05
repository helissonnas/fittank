package br.com.fittank.fittank.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fittank.fittank.model.Academia;
import br.com.fittank.fittank.service.exception.ObjectNotFoundException;

public interface EntityService<T> {
	
	JpaRepository getRepository();
	
	default public Object find(Integer id) {
		Object obj = getRepository().findOne(id);
		
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado!");
		}
		
		return obj;
	}

	default public Object save(T obj) {
		return this.getRepository().save(obj);
	}

	default public void delete(T entity) {
		this.getRepository().delete(entity);
	}

	default public void update(Academia entity) {
		// TODO Auto-generated method stub		
	}

	default public List<T> findAll() {
		return this.getRepository().findAll();
	}
}
