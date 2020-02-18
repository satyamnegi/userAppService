package com.embl.ebi.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.embl.ebi.person.entity.PersonEntity;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity,Long>{

}
