package com.springprojects.dojoninjasrelationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springprojects.dojoninjasrelationships.models.Dojos;
import com.springprojects.dojoninjasrelationships.repositories.DojosRepository;

@Service
public class DojosService {
	@Autowired
	DojosRepository dojosRepo;
	
	//methods
	//method to retrieve all dojos
	public List<Dojos> allDojos(){
		return dojosRepo.findAll();
	}
	
	//method to find dojo by it's id!
	public Dojos findDojo(Long dojo_id) {
		Optional<Dojos> dojo = dojosRepo.findById(dojo_id);
		if(dojo.isPresent()) {
			return dojo.get();
		}else {
			return null;
		}
	}
	
	//method to create a new dojo
	public void createNewDojo(Dojos newDojo) {
		dojosRepo.save(newDojo);
	}
}
