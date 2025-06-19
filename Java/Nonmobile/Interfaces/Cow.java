package com.example.javalib;

public class Cow implements IAnimal {

    @Override
    public void food() {
        System.out.println("I eat grass");
    }

    @Override
    public void sound() {
        System.out.println("Mooooo");
    }

    @Override
    public void deed() {
        System.out.println("I guard home");
    }

}
