package br.com.fittank.fittank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fittank.fittank.model.Personal;

public interface PersonalRepository extends JpaRepository<Personal, Integer> {

}
