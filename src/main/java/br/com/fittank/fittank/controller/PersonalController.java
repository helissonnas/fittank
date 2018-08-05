package br.com.fittank.fittank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fittank.fittank.model.Personal;
import br.com.fittank.fittank.service.PersonalService;

@RestController
@RequestMapping("/personal")
public class PersonalController implements RouterController<Personal> {

	@Autowired
	private PersonalService personalService;
	
	@Override
	public PersonalService getService() {
		return this.personalService;
	}

}
