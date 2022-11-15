package com.springprojects.productscategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springprojects.productscategories.models.Category;
import com.springprojects.productscategories.models.Product;

@Repository
public interface ProductsRepository extends CrudRepository<Product, Long>{
	List<Product> findAll();
	
	//method to retrieve all products that related to this specific category
	List<Product> findAllByCategories(Category specificCategory);
	
	//method to retrieve all products that NOT related to this specific category
	List<Product> findByCategoriesNotContains(Category specificCategory);
}
