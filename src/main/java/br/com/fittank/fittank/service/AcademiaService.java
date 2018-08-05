package br.com.fittank.fittank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fittank.fittank.model.Academia;
import br.com.fittank.fittank.repository.AcademiaRepository;
import br.com.fittank.fittank.service.exception.ObjectNotFoundException;

@Service
public class AcademiaService implements EntityService<Academia> {
	
	@Autowired
	AcademiaRepository academiaRepository;
	
	@Override
	public Academia find(Integer id) {
		Academia acad = academiaRepository.findOne(id);
		
		if (acad == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Academia.class.getName());
		}
		
		return acad;
	}

	@Override
	public Academia save(Academia academia) {
		return this.academiaRepository.save(academia);
	}

	@Override
	public void delete(Academia entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Academia entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Academia> findAll() {
		return this.academiaRepository.findAll();
	}
	
}
