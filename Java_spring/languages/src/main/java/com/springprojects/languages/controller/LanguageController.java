package com.springprojects.languages.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springprojects.languages.models.Language;
import com.springprojects.languages.services.LanguageService;

@Controller
public class LanguageController {
	@Autowired
	LanguageService languageService;
	//routes
	//first page (home page which represent all languages and create new one)
	//first mapping to render the home page
	@GetMapping("/")
	public String homePage() {
		return "redirect:/languages";
	}
	//second mapping to represent all languages
	@GetMapping("/languages")
	public String allLanguages(@ModelAttribute("newLanguage") Language newLangauge,Model model){
		List<Language> allLanguages = languageService.allLanguages();
		model.addAttribute("allLanguages", allLanguages);
		return "homePage.jsp";
	}
	//third mapping to create a new language from form
	@PostMapping("/languages")
	public String createNewLanguage(@Valid @ModelAttribute("newLanguage") Language newLangauge, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Language> allLanguages = languageService.allLanguages();
			model.addAttribute("allLanguages", allLanguages);
			return "homePage.jsp";
		}else {
			languageService.createNewLanguage(newLangauge);
			return "redirect:/languages";
		}
	}
	
}
