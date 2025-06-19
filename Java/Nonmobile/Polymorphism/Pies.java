package com.example.javalib;

public class Pies extends Zwierze{

    public Pies(int waga) {
        super();
        System.out.println("Jestem psem, ważę " + waga + "kg");
    }

    @Override
    public void dajGlos() {
        System.out.println("hau hau");
    }

    @Override
    public void czymSieKarmie() {
        System.out.println("Karmię się: karmą i kośćmi");
    }
}
