package com.example.dabrok.controller;

import com.example.dabrok.entity.Person;
import com.example.dabrok.services.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;
    //Import del log4j para poder mostrar mensajes de error en logs en caso de necesitarlo.
    static Logger logger = (Logger) LoggerFactory.getLogger(Logger.class);

    @GetMapping("/all")
    public List<Person> findAll(){
        logger.debug("[PersonController] Init method findAll");
        return personService.findAll();
    }
}
