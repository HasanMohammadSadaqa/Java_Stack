package com.springprojects.FruityLoops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springprojects.FruityLoops.models.Items;

@Controller
public class ItemController {
	@RequestMapping("/")
	public String itemList(Model model) {
		ArrayList<Items> Fruits = new ArrayList<Items>();
		Fruits.add(new Items("Kiwi", 1.5));
		Fruits.add(new Items("Mango", 2));
		Fruits.add(new Items("Goji Berries", 4));
		Fruits.add(new Items("Guava", 0.75));
		
		model.addAttribute("fruitsfromcontroller", Fruits);
		
		return "index.jsp";
	}
	
}
