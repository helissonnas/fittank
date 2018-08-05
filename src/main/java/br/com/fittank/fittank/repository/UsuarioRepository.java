package br.com.fittank.fittank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fittank.fittank.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
