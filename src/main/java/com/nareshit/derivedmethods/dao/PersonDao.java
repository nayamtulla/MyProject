package com.nareshit.derivedmethods.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.derivedmethods.model.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, Integer> {

	//Slowly we will add all dervived Methods Here

}
