package com.embl.ebi.person.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PersonModel {

	private String firstName;
	
	private String lastName;
	
	private Integer age;
	
	private String favouriteColour;
	
	private List<String> hobby;
	
}
