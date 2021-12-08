package com.lti.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class HomeController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Welcome to lti";
	}
	
	@GetMapping("/{id}")
	public String pathVariable(@PathVariable Integer id) {
		return "Welcome to lti......."+id;
	}


}
