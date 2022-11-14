package com.springprojects.dojoninjasrelationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springprojects.dojoninjasrelationships.models.Dojos;

@Repository
public interface DojosRepository extends CrudRepository<Dojos, Long>{
	List<Dojos> findAll();
}
