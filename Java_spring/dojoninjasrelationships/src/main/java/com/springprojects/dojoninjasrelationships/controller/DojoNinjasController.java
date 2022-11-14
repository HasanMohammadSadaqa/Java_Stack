package com.springprojects.dojoninjasrelationships.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springprojects.dojoninjasrelationships.models.Dojos;
import com.springprojects.dojoninjasrelationships.models.Ninjas;
import com.springprojects.dojoninjasrelationships.services.DojosService;
import com.springprojects.dojoninjasrelationships.services.NinjasService;

@Controller
public class DojoNinjasController {
	@Autowired
	DojosService dojoService;
	
	@Autowired
	NinjasService ninjaServis;
	
	//methods for dojos
	//method to redirect to home page URL of the home page
	@GetMapping("/")
	public String redirectToHomePage() {
		return "redirect:/dojo/new";
	}
	
	//2 methods to render home page and create new dojo
	//first method to render home page
	@GetMapping("/dojo/new")
	public String homePage(@ModelAttribute("newDojo") Dojos newDojo) {
		return "home_page.jsp";
	}
	
	//second method to create new dojo
	@PostMapping("/dojo/new")
	public String newDojo(@Valid @ModelAttribute("newDojo") Dojos newDojo, BindingResult result) {
		if(result.hasErrors()) {
			return "home_page.jsp";
		}else {
			dojoService.createNewDojo(newDojo);
			return "redirect:/";
		}
	}
	
	//methods for ninjas
	//method to get create new ninja page from home page through the link
	@RequestMapping("/create new ninja")
	public String toCreateNinjas() {
		return "redirect:/ninjas/new";
	}
	//2 methods to render create new ninja page
	//first method to render new ninjas page
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("newNinja") Ninjas newNinja, Model model) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "create_new_ninja.jsp";
	}
	
	//method to create a new ninja
	@PostMapping("/ninjas/new")
	public String newNinja(@Valid @ModelAttribute("newNinja") Ninjas newNinja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("dojos", dojoService.allDojos());
			return "create_new_ninja.jsp";
		}else {
			ninjaServis.createNewNinja(newNinja);
			return "redirect:/ninjas/new";
		}
	}
	
	//method to view ninjas for a specific dojo
	@GetMapping("dojos/{dojo_id}")
	public String ninjasForDojo(@PathVariable("dojo_id") Long dojoId, Model model) {
		model.addAttribute("specificDojo", dojoService.findDojo(dojoId));
		return "ninjas_for_dojo.jsp";
	}
	
	
}
