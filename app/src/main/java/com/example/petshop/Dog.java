package com.example.petshop;

import java.util.Date;
//the exact same code but exchange 'cat' with 'dog'. That's it.
public class Dog extends Pet implements Pettable {
    //instead of adding implements to pet(superclass) you'd manually add to both cat and dog
    // but not scorpion for obvious reasons
    public Dog(String name) {
        super(name);
    }

    public Dog(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "bark";
    }

    @Override
    public void pet() { }
}
