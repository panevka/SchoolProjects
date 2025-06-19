package com.example.javalib;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<IAnimal> animals = new LinkedList<>();
        Dog dog1 = new Dog();
//        Animal dog = new Dog()

        animals.add(dog1);
        animals.add(new Cat());
        animals.add(new Cow());
        animals.add(new Cow());
        animals.add(new Cat());
        animals.add(new Dog());

        for (IAnimal animal :
                animals) {
            animal.food();
            animal.sound();
            animal.type();
            animal.deed();
            System.out.println("----------------");
        }
    }
}
