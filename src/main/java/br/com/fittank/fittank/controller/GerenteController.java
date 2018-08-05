package br.com.fittank.fittank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fittank.fittank.model.Gerente;
import br.com.fittank.fittank.service.GerenteService;

@RestController
@RequestMapping("/gerente")
public class GerenteController implements RouterController<Gerente> {

	@Autowired
	private GerenteService gerenteService;

	@Override
	public GerenteService getService() {
		return gerenteService;
	}

}
