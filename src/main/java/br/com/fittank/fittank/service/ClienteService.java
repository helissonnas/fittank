package br.com.fittank.fittank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fittank.fittank.model.Cliente;
import br.com.fittank.fittank.repository.ClienteRepository;

@Service
public class ClienteService implements EntityService<Cliente> {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public ClienteRepository getRepository() {
		return this.clienteRepository;
	}

}
