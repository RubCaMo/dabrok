package com.example.dabrok.entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "p_name")
    private String name;
    @Column(name = "p_lastname")
    private String lastname;
    @Column(name = "p_phone_number")
    private int phoneNumber;
    private String gender;

    /*Indicamos con la notación de ManyToMan que la entidad Persona tiene una relacion
    * con las direcciones, JoinTable define la tabla intermedia, le da nombre a la tabla
    * y las foreign keys se utilizarán de llave para unir las tablas.
    * */
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "person_address",
            joinColumns = @JoinColumn (name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "adress_id")
    )
    private Set<Address> adresses = new HashSet<>();

    public Person() {}
    public Person(int id, String name, String lastname, int phoneNumber, String gender) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
