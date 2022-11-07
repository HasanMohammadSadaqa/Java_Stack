package com.springprojects.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class CounterController {
	@RequestMapping("")
	public String welcomig(HttpSession session) {
		if (session.getAttribute("count") == null){
			session.setAttribute("count", 0);
			System.out.println(session.getAttribute("count"));
		}
		else {
			Integer mycounter =  (Integer) session.getAttribute("count");
			mycounter++;
			session.setAttribute("count", mycounter);
//			model.addAttribute("counter", session.getAttribute("count"));
		}
		return"welcome.jsp";
	}
	
	@RequestMapping("/counter")
	public String showCounter(HttpSession session) {
		return "counter.jsp";
	}
	
	@RequestMapping("/counter2")
	public String add2(HttpSession session) {
		if (session.getAttribute("count") == null){
			session.setAttribute("count", 0);
			System.out.println(session.getAttribute("count"));
		}
		else {
			Integer mycounter =  (Integer) session.getAttribute("count");
			mycounter =+2;
			session.setAttribute("count", mycounter);
//			model.addAttribute("counter", session.getAttribute("count"));
		}
		return"counter2.jsp";
	}
	@RequestMapping("/counterdestroy")
	public String counterDestroy(HttpSession session) {
		session.setAttribute("count", 0);
		return "counter.jsp";
	}
}
