package br.com.fittank.fittank.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fittank.fittank.model.Academia;
import br.com.fittank.fittank.repository.AcademiaRepository;

@RestController
@RequestMapping("/academia")
public class AcademiaController {
	
	@Autowired
	private AcademiaRepository academiaRepo;
	
	@GetMapping
	public Iterable<Academia> listaAcademias() {
		Iterable<Academia> listaAcademia = this.academiaRepo.findAll();
		return listaAcademia;
	}
	
	@PostMapping
	public Academia cadastrarAcademia(@Valid Academia academia) {
		return this.academiaRepo.save(academia);
	}
	
	@DeleteMapping
	public Academia deletaAcademia(Academia academia) {
		this.academiaRepo.delete(academia);
		return academia;
	}
}
