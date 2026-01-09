package com.example.petshop;

import java.util.Date;

public abstract class Pet { //abstracts classes are like regular classes, but can be created but allowed
    //to be used as a superclass
    private String name; //disallows pet.name, pet.birthdate, etc
    private Date birthDate; //lower cammelcase not like c
//can generate getter and setter, right-click on empty space and click getter and setter under generate
    // do both attributes 'string and date'
    public Pet(String name) {
        this(name, new Date());
    }

    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public abstract String speak(); //defining this function exits but no code for what it does.

}



