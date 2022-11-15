package com.springprojects.productscategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springprojects.productscategories.models.Category;
import com.springprojects.productscategories.models.Product;
import com.springprojects.productscategories.repositories.CategoriesRepository;
@Service
public class CategoriesService {
	@Autowired
	CategoriesRepository categoryRepo;
	
	public List<Category> allCategories() {
		return categoryRepo.findAll();
	}
	
	
	public Category createCategory(Category category) {
		return categoryRepo.save(category);
	}
	
	
	public Category findCategory(Long id) {
		Optional<Category> optionalCategory = categoryRepo.findById(id);
		if(optionalCategory.isPresent()) {
			return optionalCategory.get();			
		}
		else {
			return null;
		}
	}
	
	
	public List<Category> categoriesNotBelongToThisProduct(Product product){
		return categoryRepo.findByProductsNotContains(product);
	}
	
	
	public void deleteCategory(Long id) {
		categoryRepo.deleteById(id);
	}
}
