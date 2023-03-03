package com.example.dabrok.repositories;

import com.example.dabrok.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository  extends CrudRepository<Person, Integer> {
    List<Person> findPersonByName(@Param("name") String name);
}
