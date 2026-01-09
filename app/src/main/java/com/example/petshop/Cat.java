package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable { //extends make this file a subclass of pet
    //cat now has all of pets attributes and functions, these are the perks of a subclass,
    //can all be reused
    public Cat(String name) {
        super(name); //keyword super, calls pets constructor that only takes string
    }

    public Cat(String name, Date birthDate) {
        super(name, birthDate); // same thing as above but takes both
    }

    @Override //this is because of the abstract title of the speak, overriding superclass but do what
    // the subclass says to do
    public String speak() {
        return "meow";
    }

    @Override
    public void pet() { }
}
