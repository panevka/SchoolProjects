package com.example.javalib;

public interface IAnimal extends IAnimal2{

    public void sound();
    void food();

    default void type(){
        System.out.println("I am of type: " + getClass().getSimpleName());
    }
}
