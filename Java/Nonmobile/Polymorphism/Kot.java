package com.example.javalib;

public class Kot extends Zwierze{

    int wiek;
    public Kot(int waga, int wiek) {
        super(waga);
        this.wiek = wiek;
        System.out.println("Jestem kotem");
        ileWaze();
    }

    public void ileWaze(){
        System.out.println("Ważę: " + waga);
    }

    public void ileMamLat(){
        System.out.println("Mam " + wiek + "lat");
    }

    @Override
    public void dajGlos() {
        System.out.println("miau miau");
    }

    @Override
    public void czymSieKarmie() {
        System.out.println("Karmię się: myszami i karmą");
    }
}
