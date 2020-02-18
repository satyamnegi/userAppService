package com.embl.ebi.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.embl.ebi.person.entity.PersonEntity;
import com.embl.ebi.person.model.AuthenticationBean;
import com.embl.ebi.person.model.PersonModel;
import com.embl.ebi.person.service.PersonService;

@RestController
@CrossOrigin(origins="*") 
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping(path = "/auth/basicauth")
	public AuthenticationBean helloWorldBean() {
		return new AuthenticationBean("You are authenticated");
	}	
	
	@GetMapping("/api/getAllPersons")
	 public List<PersonEntity> getAllPersons() {
	  List<PersonEntity> employees = personService.getAllPersons();
	  return employees;
	 }
	  
	 @GetMapping("/api/getPersonById/{personId}")
	 public List<PersonEntity> getPersonById(@PathVariable(name="personId")Long personId) {
	  return personService.getPersonById(personId);
	 }
	  
	 @PostMapping("/api/savePerson")
	 public void savePerson(@RequestBody List<PersonModel> persons){
		 personService.savePerson(persons);
	  System.out.println("Person Saved Successfully");
	 }
	  
	 @DeleteMapping("/api/deletePerson/{personId}")
	 public void deletePersonById(@PathVariable(name="personId")Long personId){
		 personService.deletePersonById(personId);
	  System.out.println("Person Deleted Successfully");
	 }
	  
	 @PostMapping("/api/updatePersonById/{personId}")
	 public void updateEmployee(@RequestBody PersonEntity person,
	   @PathVariable(name="personId")Long personId){
		 List<PersonEntity> emp = personService.getPersonById(personId);
	  if(emp.get(0) != null){
		  personService.updatePerson(person);
	  }
	   
	 }

}
