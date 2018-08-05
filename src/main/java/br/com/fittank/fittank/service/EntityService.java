package br.com.fittank.fittank.service;

import java.util.List;

public interface EntityService<T> {
	
	List<T> findAll();
	
	T find(Integer id);

	T save(T entity);
	
	void delete(T entity);
	
	void update(T entity);
}
