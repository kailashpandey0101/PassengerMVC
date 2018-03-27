package com.imcs.mvc.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.imcs.mvc.entity.Passenger;

@Controller
public class PassengerController {

	static final String URL = "http://192.168.1.72:8080/customer";

	@RequestMapping(value = "/addPassenger.do", method = RequestMethod.POST)
	public String addPassenger(@ModelAttribute Passenger passenger, ModelMap model) {
		model.addAttribute("passenger", new Passenger());
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Passenger> entity = new HttpEntity<Passenger>(passenger);
		ResponseEntity<Passenger> responseEntity = restTemplate.exchange(URL + "/add", HttpMethod.POST, entity,
				Passenger.class);
		if (responseEntity.getStatusCode() == HttpStatus.CREATED) {
			// System.out.println("Customer is created successfully, id: ");
			model.addAttribute("successMsg", "passenger is created successful");
			return "index";
		} else {
			model.addAttribute("error", "passenger creation failed");
			return "index";

		}
	}

}
