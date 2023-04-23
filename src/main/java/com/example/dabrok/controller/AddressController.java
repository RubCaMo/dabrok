package com.example.dabrok.controller;

import com.example.dabrok.entity.Address;
import com.example.dabrok.services.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

//@RestController
//@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    static Logger logger = (Logger) LoggerFactory.getLogger(Logger.class);

    @GetMapping("/all")
    public List<Address> findAll(){
        return addressService.findAll();
    }
}
