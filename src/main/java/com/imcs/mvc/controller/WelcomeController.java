package com.imcs.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.imcs.mvc.entity.Passenger;

@Controller
public class WelcomeController {

	@GetMapping("/")
	public String welcomePage() {
		return "index";
	}

	@GetMapping("/addPassenger")
	public String loginController(Model model) {
		model.addAttribute("passenger", new Passenger());
		return "addPassenger";
	}
}
