package com.gortiz.rest.restajax.service;

import java.util.List;

import com.gortiz.rest.restajax.entity.Person;

public interface PersonService {
	
	Person save(Person p);
	
	List<Person> getPersons();

}
