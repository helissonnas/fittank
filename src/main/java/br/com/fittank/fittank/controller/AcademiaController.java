package br.com.fittank.fittank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fittank.fittank.model.Academia;
import br.com.fittank.fittank.model.Usuario;
import br.com.fittank.fittank.service.AcademiaService;
import br.com.fittank.fittank.service.UsuarioService;

@RestController
@RequestMapping("/academia")
public class AcademiaController implements RouterController<Academia> {
	
	@Autowired
	private AcademiaService academiaServ;
	
	@Autowired
	private UsuarioService userService;

	@Override
	public AcademiaService getService() {
		return this.academiaServ;
	}
	
	@RequestMapping(value="/email/{email:.+}", method=RequestMethod.GET)
	public Academia getByEmail(@PathVariable String email) {
		Usuario user = this.userService.findByEmail(email);
		return user.getAcademia();
	}
}
