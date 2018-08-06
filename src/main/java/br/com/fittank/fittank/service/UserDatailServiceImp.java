package br.com.fittank.fittank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.fittank.fittank.model.Usuario;
import br.com.fittank.fittank.repository.UsuarioRepository;
import br.com.fittank.fittank.security.UserSS;

@Service
public class UserDatailServiceImp implements UserDetailsService {

	@Autowired
	private UsuarioRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Usuario user = repo.findByEmail(email);
		if (user == null) {
			throw new UsernameNotFoundException("O email nao pertence a nenhum usuario.");
		}
		
		return new UserSS(user.getId(), user.getEmail(), user.getSenha(), user.getPerfis());
	}
}
