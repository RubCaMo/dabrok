package com.example.dabrok.repositories;

import com.example.dabrok.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "" , path = "addresses")
public interface AddressRepository extends JpaRepository<Address, Integer> {
    //METHODS TO BE IMPLEMENTED like findbyAdress..
}
