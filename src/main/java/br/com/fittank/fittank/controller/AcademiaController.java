package br.com.fittank.fittank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fittank.fittank.model.Academia;
import br.com.fittank.fittank.service.AcademiaService;

@RestController
@RequestMapping("/academia")
public class AcademiaController implements RouterController<Academia> {
	
	@Autowired
	private AcademiaService academiaServ;

	@Override
	public AcademiaService getService() {
		return this.academiaServ;
	}
}
