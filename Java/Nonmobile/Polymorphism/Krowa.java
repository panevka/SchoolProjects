package com.example.javalib;

public class Krowa extends Zwierze{

    public Krowa(int waga) {
        super();
        System.out.println("Jestem krową, ważę " + waga + "kg");
    }

    @Override
    public void czymSieKarmie() {
        System.out.println("Karmię się: trawą");
    }

    @Override
    public void dajGlos() {
        System.out.println("muu");
    }
}
