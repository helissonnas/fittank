package br.com.fittank.fittank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fittank.fittank.model.Gerente;
import br.com.fittank.fittank.repository.GerenteRepository;

@Service
public class GerenteService implements EntityService<Gerente> {

	@Autowired
	private GerenteRepository gerenteRepository;

	@Override
	public GerenteRepository getRepository() {
		return gerenteRepository;
	}

}
