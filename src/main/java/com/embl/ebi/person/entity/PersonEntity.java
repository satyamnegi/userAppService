package com.embl.ebi.person.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="PERSON")
@Getter
@Setter
@ToString
public class PersonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PERSONID", updatable = false, nullable = false)
	private Long id;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="AGE")
	private Integer age;
	
	@Column(name="FAVOURITE_COLOUR")
	private String favouriteColour;
	
	@Column(name="HOBBY")
	@ElementCollection
	private List<String> hobby;
	
}
