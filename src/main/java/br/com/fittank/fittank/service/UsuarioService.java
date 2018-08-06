package br.com.fittank.fittank.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fittank.fittank.model.Usuario;
import br.com.fittank.fittank.model.enums.Perfil;
import br.com.fittank.fittank.repository.UsuarioRepository;

@Service
public class UsuarioService implements EntityService<Usuario> {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public UsuarioRepository getRepository() {
		return this.usuarioRepository;
	}

	public List<Usuario> findGerentes() {		
		return this.usuarioRepository.findByPerfis(Perfil.GERENTE.ordinal());
	}	
}
