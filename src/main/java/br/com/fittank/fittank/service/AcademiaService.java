package br.com.fittank.fittank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fittank.fittank.model.Academia;
import br.com.fittank.fittank.repository.AcademiaRepository;

@Service
public class AcademiaService implements EntityService<Academia> {
	
	@Autowired
	AcademiaRepository academiaRepository;

	@Override
	public AcademiaRepository getRepository() {
		return this.academiaRepository;
	}
	
	
	
}
