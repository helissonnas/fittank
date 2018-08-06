package br.com.fittank.fittank.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fittank.fittank.model.Usuario;
import br.com.fittank.fittank.service.UsuarioService;

@RestController
@RequestMapping("/gerente")
public class GerenteController implements RouterController<Usuario> {
	
	@Autowired
	private UsuarioService usuarioservice;

	@Override
	public UsuarioService getService() {
		return this.usuarioservice;
	}
	
	@Override
	@RequestMapping(method=RequestMethod.GET)
	public List<Usuario> getAll() {
		List<Usuario> obj = getService().findGerentes();
		
		System.out.println(obj.toString());
		return obj;
	}
}
