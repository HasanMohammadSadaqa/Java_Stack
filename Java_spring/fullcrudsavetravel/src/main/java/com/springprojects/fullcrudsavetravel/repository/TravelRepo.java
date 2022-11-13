package com.springprojects.fullcrudsavetravel.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springprojects.fullcrudsavetravel.models.Travel;

@Repository
public interface TravelRepo extends CrudRepository<Travel,Long> {
	List<Travel> findAll();

}