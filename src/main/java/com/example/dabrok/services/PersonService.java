package com.example.dabrok.services;

import com.example.dabrok.entity.Person;
import com.example.dabrok.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository _personRepository;

    public List<Person> findAll() {
        System.out.println("GET ALL PERSONS INIT");
        return (List<Person>) this._personRepository.findAll();
    }

    public Person findPersonByName(String name){
        System.out.println("[PERSON-FINDBYNAME] Name = " + name);
        return this._personRepository.findPersonByName(name);
    }

    public Person findPersonById(int id){
        return this.findPersonById(id);
    }
}
