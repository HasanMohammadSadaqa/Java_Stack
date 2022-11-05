package com.springprojects.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	@RequestMapping("/")
	public String greeting(@RequestParam (value = "name", required = false) String visitorName) {
		if(visitorName == null ) {
			return "Hello Human";
		}
		return "Hello " + visitorName;
	}
}