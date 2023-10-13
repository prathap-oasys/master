package com.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeopsController {
	
	
	@GetMapping(value="dev")
	public String devopsdisplay() {
		return "devops";
		
	}

}
