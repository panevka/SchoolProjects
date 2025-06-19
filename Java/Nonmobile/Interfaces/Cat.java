package com.example.javalib;

public class Cat implements IAnimal {

    @Override
    public void deed() {
        System.out.println("I eat mice");
    }

    @Override
    public void food() {
        System.out.println("I eat cat food");
    }

    @Override
    public void sound() {
        System.out.println("Meow meow");
    }

}
