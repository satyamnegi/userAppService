package com.embl.ebi.person.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.embl.ebi.person.entity.PersonEntity;
import com.embl.ebi.person.model.PersonModel;
import com.embl.ebi.person.repository.PersonRepository;
import com.embl.ebi.person.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public List<PersonEntity> getAllPersons() {
		List<PersonEntity> persons = personRepository.findAll();
		return persons;
	}

	@Override
	public void savePerson(List<PersonModel> persons) {
		List<PersonEntity> entities = new ArrayList<>();
		persons.stream().forEach(per -> {
			PersonEntity ent = new PersonEntity();
			BeanUtils.copyProperties(per, ent);
			entities.add(ent);
		});
		personRepository.saveAll(entities);
	}

	@Override
	public List<PersonEntity> getPersonById(Long personId) {
		Optional<PersonEntity> optEmp = personRepository.findById(personId);
		List<PersonEntity> output = new ArrayList<>();
		output.add(optEmp.get());
		  return output;
	}

	@Override
	public void deletePersonById(Long personId) {
		personRepository.deleteById(personId);
	}

	@Override
	public void updatePerson(PersonEntity person) {
		personRepository.save(person);
	}

}
