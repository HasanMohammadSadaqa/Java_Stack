package com.springprojects.productscategories.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springprojects.productscategories.models.Category;
import com.springprojects.productscategories.models.Product;
import com.springprojects.productscategories.services.CategoriesService;
import com.springprojects.productscategories.services.ProductsService;

@Controller
public class MainController {
	@Autowired
	ProductsService produtcsService;
	
	@Autowired
	CategoriesService CategoriesService;
	//methods
	//method to render home page
	@GetMapping("/")
	public String allProductAndCategories(Model model) {
		model.addAttribute("allProducts", produtcsService.allProduct());
		model.addAttribute("allCategories", CategoriesService.allCategories());
		return "home_page.jsp";
	}
	@GetMapping("/products/new")
	public String newProduct(@ModelAttribute("newProduct")Product newProduct) {
		return "new_product.jsp";
	}
	@PostMapping("/products/new")
	public String createNewProduct(@Valid @ModelAttribute("newProduct") Product newProduct, BindingResult result) {
		if(result.hasErrors()) {
			return "new_product.jsp";
		}else {
			produtcsService.createProduct(newProduct);
			return "redirect:/";
		}
	}
	@GetMapping("/categories/new")
	public String newCategory(@ModelAttribute("newCategory")Category newCategory) {
		return "new_category.jsp";
	}
	@PostMapping("/categories/new")
	public String createNewCategory(@Valid @ModelAttribute("newCategory") Category newCategory, BindingResult result) {
		if(result.hasErrors()) {
			return "new_category.jsp";
		}else {
			CategoriesService.createCategory(newCategory);
			return "redirect:/";
		}
	}
	
	@GetMapping("/products/{product_id}")
	public String viewProduct(@PathVariable("product_id") Long product_id, @ModelAttribute("specificProduct") Product specificProduct, Model model) {
		model.addAttribute("specificProduct", produtcsService.findProduct(product_id));
		model.addAttribute("allCategoriesNotBelongToThisProduct", CategoriesService.categoriesNotBelongToThisProduct(produtcsService.findProduct(product_id)));
		return "specific_product.jsp";
	}
	@PostMapping("/products/{product_id}")
	public String addCategoryToProduct(@PathVariable("product_id") Long product_id,  @RequestParam("category_id") Long category_id) {
		Category category = CategoriesService.findCategory(category_id);
		Product product = produtcsService.findProduct(product_id);
		category.getProducts().add(product);
		CategoriesService.createCategory(category);
		return "redirect:/products/" + product_id;
	}
	
	@GetMapping("/categories/{category_id}")
	public String viewCategoriy(@PathVariable("category_id") Long category_id, @ModelAttribute("specificCategory") Category specificCategory, Model model) {
		model.addAttribute("specificCategory", CategoriesService.findCategory(category_id));
		model.addAttribute("allProductNotBelongToThisCategory", produtcsService.categoriesNotBelongToProduct(CategoriesService.findCategory(category_id)));
		return "specific_category.jsp";
	}
	
	@PostMapping("/categories/{category_id}")
	public String addProductToCategory(@PathVariable("category_id") Long category_id, @RequestParam("product_id") Long product_id) {
		Product product = produtcsService.findProduct(product_id);
		Category category = CategoriesService.findCategory(category_id);
		product.getCategories().add(category);
		produtcsService.createProduct(product);
		return "redirect:/categories/" + category_id;
	}
	
}
