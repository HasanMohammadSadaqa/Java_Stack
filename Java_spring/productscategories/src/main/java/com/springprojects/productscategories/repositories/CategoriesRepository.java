package com.springprojects.productscategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springprojects.productscategories.models.Category;
import com.springprojects.productscategories.models.Product;

@Repository
public interface CategoriesRepository extends CrudRepository<Category, Long> {
	List<Category> findAll();
	
	//method to retrieve all categories that belong to specific product
	List<Category> findAllByProducts(Product specificProduct);
	
	//method to retrieve all categories that NOT belong to this specific product
	List<Category> findByProductsNotContains(Product specificProduct);
}
