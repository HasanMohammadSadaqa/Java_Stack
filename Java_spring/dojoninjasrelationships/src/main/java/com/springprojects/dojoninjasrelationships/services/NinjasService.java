package com.springprojects.dojoninjasrelationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springprojects.dojoninjasrelationships.models.Ninjas;
import com.springprojects.dojoninjasrelationships.repositories.NinjasRepository;

@Service
public class NinjasService {
	@Autowired
	NinjasRepository ninjaRepo;
	
	//methods
	//method to retrieve all ninjas
	public List<Ninjas> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	//method to find ninjas by id
	public Ninjas findNinja(Long ninja_id) {
		Optional<Ninjas> ninja = ninjaRepo.findById(ninja_id);
		if(ninja.isPresent()) {
			return ninja.get();
		}else {
			return null;
		}
	}
	
	//method to create a new ninja
	public void createNewNinja(Ninjas newNinja) {
		ninjaRepo.save(newNinja);
	}
}
