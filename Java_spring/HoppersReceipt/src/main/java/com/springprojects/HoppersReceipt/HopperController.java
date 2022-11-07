package com.springprojects.HoppersReceipt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HopperController {
	@RequestMapping("/")
	public String information(Model model) {
		String customerName = "Hasan Sadaqa";
		String itemName = "Copper wire";
		String price = "$5.25";
		String desc = "Metal strips. Also an illustration of nonoseconds";
		String vendor = "Little Things Corner Store";
		
		model.addAttribute("customerName", customerName);
		model.addAttribute("itemName", itemName);
		model.addAttribute("price", price);
		model.addAttribute("description", desc);
		model.addAttribute("vendor", vendor);
		
		return "index.jsp";
		
	}
}
