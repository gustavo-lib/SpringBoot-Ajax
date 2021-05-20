package com.gortiz.rest.restajax.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gortiz.rest.restajax.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
