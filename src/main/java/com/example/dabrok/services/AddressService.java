package com.example.dabrok.services;

import com.example.dabrok.entity.Address;
import com.example.dabrok.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class AddressService {
    @Autowired
    private AddressRepository _addressRepository;

    public Set<Address> findAll(){
        return (Set<Address>) this._addressRepository;
    }
}
