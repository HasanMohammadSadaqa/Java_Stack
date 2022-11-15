package com.springprojects.productscategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springprojects.productscategories.models.Category;
import com.springprojects.productscategories.models.Product;
import com.springprojects.productscategories.repositories.ProductsRepository;

@Service
public class ProductsService {
	@Autowired
	ProductsRepository productsRepo;
	
	//methods
	//method to retrieve all products
	public List<Product> allProduct(){
		return productsRepo.findAll();
	}
	
	//method to catch a specific product
	public Product findProduct(Long product_id) {
		Optional<Product> product = productsRepo.findById(product_id);
		if(product.isPresent()) {
			return product.get();
		}else {
			return null;
		}
	}
	
	//method to create new product
	public void createProduct(Product newProduct) {
		productsRepo.save(newProduct);
	}
	
	//method to delete specific product
	public void deleteProduct(Long productId) {
		productsRepo.deleteById(productId);
	}
	
	//method to find all product that belong to this category
	public List<Product> categoriesBelongToProduct(Category category){
		return productsRepo.findAllByCategories(category);
	}
	
	//method to find all products that NOT belong to this category
	public List<Product> categoriesNotBelongToProduct(Category category){
		return productsRepo.findByCategoriesNotContains(category);
	}
}
