package br.com.fittank.fittank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fittank.fittank.model.Personal;
import br.com.fittank.fittank.repository.PersonalRepository;

@Service
public class PersonalService implements EntityService<Personal> {

	@Autowired
	private PersonalRepository personalRepository;
	
	@Override
	public PersonalRepository getRepository() {
		return this.personalRepository;
	}
	
}
