package br.com.fittank.fittank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fittank.fittank.model.Cliente;
import br.com.fittank.fittank.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController implements RouterController<Cliente> {

	@Autowired
	private ClienteService clienteService;
	
	@Override
	public ClienteService getService() {
		return this.clienteService;
	}

}
