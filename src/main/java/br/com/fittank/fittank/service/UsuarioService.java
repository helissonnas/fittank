package br.com.fittank.fittank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fittank.fittank.model.Usuario;
import br.com.fittank.fittank.repository.UsuarioRepository;

@Service
public class UsuarioService implements EntityService<Usuario> {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public UsuarioRepository getRepository() {
		return this.usuarioRepository;
	}
	
	
}
