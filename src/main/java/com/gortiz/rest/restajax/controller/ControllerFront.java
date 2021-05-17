package com.gortiz.rest.restajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerFront {

	@GetMapping("/view")
	String saludos() {
		return "view-person";
	}

	@GetMapping("/add")
	public String addEmployees()
	{
		return "add-person";
	}
}
