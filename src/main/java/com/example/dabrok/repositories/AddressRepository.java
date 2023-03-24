package com.example.dabrok.repositories;

import com.example.dabrok.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
    //METHODS TO BE IMPLEMENTED like findbyAdress..
}
