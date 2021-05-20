package com.gortiz.rest.restajax.controllerrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gortiz.rest.restajax.entity.Person;
import com.gortiz.rest.restajax.service.PersonService;

@RestController
public class ControllerRest {
	
	@Autowired
	PersonService personService;
	@PostMapping(value = "/person")
	public ResponseEntity<Object> createperson(@RequestBody Person person)
	{
		person = personService.save(person);
		return new ResponseEntity<>(
				"person is created successfully with Id = " + person.getId(),
				HttpStatus.CREATED);
	}

	@GetMapping(value = "/persons")
	public ResponseEntity<Object> getpersons()
	{
		List<person> personList = personService.getpersons();
		return new ResponseEntity<>(personList, HttpStatus.OK);
	}


}
