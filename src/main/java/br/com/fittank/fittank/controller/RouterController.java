package br.com.fittank.fittank.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fittank.fittank.service.EntityService;

public interface RouterController<T> {
	
	abstract EntityService<T> getService();

	@RequestMapping(method=RequestMethod.GET)
	public default List<T> getAll() {
		List<T> obj = getService().findAll();
		return obj;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public default Object get(@PathVariable Integer id) {
		Object obj = getService().find(id);
		return obj;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public default Object post(@Valid @RequestBody T obj) {
		return getService().save(obj);
	}
		
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public default void deletaAcademia(@PathVariable T obj) {
		getService().delete(obj);
	}
}
