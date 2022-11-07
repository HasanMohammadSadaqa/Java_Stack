package com.springprojects.DisplayDate;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DisplayDate {
	@RequestMapping("")
	public String dashboard() {
		return "home_page.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat dateFormat  = new SimpleDateFormat("EEEE, 'The 'dd' of MMMM, yyyy");
		Date date = new Date();
		
		String currentDate = dateFormat.format(date);
		model.addAttribute("currentDate", currentDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
		public String time(Model model) {
			SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
			Date date = new Date();
			
			String currentTime = timeFormat.format(date);		
			model.addAttribute("currentTime", currentTime);
			return"time.jsp";
		}
}
