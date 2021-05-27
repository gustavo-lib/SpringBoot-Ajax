package com.gortiz.rest.restajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gortiz.rest.restajax.entity.Person;
import com.gortiz.rest.restajax.respository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepository personRepository;
	
	@Override
	public Person save(Person p) {
		// TODO Auto-generated method stub
		return personRepository.save(p);
	}

	@Override
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}
	
	

}
