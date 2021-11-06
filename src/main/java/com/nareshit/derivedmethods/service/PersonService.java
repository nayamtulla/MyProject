
package com.nareshit.derivedmethods.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.derivedmethods.dao.PersonDao;
import com.nareshit.derivedmethods.model.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDao personDao;

	// SaveAll method

	public Iterable<Person> saveAllPersons(Iterable<Person> personsList) {
		return personDao.saveAll(personsList);

	}

	// FindAllById Method

	public Iterable<Person> findPersonsData(Iterable<Integer> personIds) {
		return personDao.findAllById(personIds);
	}

}
