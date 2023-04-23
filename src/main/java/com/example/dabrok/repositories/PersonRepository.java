package com.example.dabrok.repositories;

import com.example.dabrok.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface PersonRepository  extends CrudRepository<Person, Integer> {
//public interface PersonRepository  extends JpaRepository<Person, Integer> {
    Person findPersonByName(@PathVariable("name") String name);
}
