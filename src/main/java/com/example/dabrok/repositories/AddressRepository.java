package com.example.dabrok.repositories;

import com.example.dabrok.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    //METHODS TO BE IMPLEMENTED like findbyAdress..
}
