package com.embl.ebi.person.service;

import java.util.List;

import com.embl.ebi.person.entity.PersonEntity;
import com.embl.ebi.person.model.PersonModel;

public interface PersonService {

	List<PersonEntity> getAllPersons();

	void savePerson(List<PersonModel> persons);

	List<PersonEntity> getPersonById(Long personId);

	void deletePersonById(Long personId);

	void updatePerson(PersonEntity person);
	

}
