package com.example.javalib;

public class Dog implements IAnimal {

    @Override
    public void food() {
        System.out.println("I eat dog food");
    }

    @Override
    public void sound() {
        System.out.println("Woof woof");
    }

    @Override
    public void deed() {
        System.out.println("I guard home");
    }

}
