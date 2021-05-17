package com.gortiz.rest.restajax.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/hola")
	String saudos() {
		return "view-person";
	}

}
