package br.com.fittank.fittank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fittank.fittank.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
