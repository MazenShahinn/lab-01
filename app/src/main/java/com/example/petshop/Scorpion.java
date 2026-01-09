package com.example.petshop;

import java.util.Date;
//the exact same code but exchange 'cat' with 'scorpion'. Now differently from dog.java
//theres no:
//Override
//public void pet() { }
//this is because the subclass of pet (pettable) bc scorpion isnt pettable
public class Scorpion extends Pet {
    public Scorpion(String name) {
        super(name);
    }

    public Scorpion(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "hiss";
    }
}

