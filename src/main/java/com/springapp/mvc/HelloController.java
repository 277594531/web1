package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		model.addAttribute("message2", "happy");
		model.addAttribute("message3", "sad");
		model.addAttribute("message4", "I am good");
		return "hello";
	}


	@RequestMapping(method = RequestMethod.POST)
	public String printHello(ModelMap model){
		model.addAttribute("message", "my hello");
		return "jsp1";
	}
}