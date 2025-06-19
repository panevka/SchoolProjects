package com.example.javalib;

public class Zwierze {

    int waga;
    public Zwierze(int waga){
        this.waga = waga;
        System.out.println("Jestem zwierzęciem");
    }

    public Zwierze(){
        System.out.println("Jestem zwierzęciem");
    }
    public void oddycham(){
        System.out.println("oddycham");
    }
    public void dajGlos(){
        System.out.println("?");
    }

    public void czymSieKarmie(){
        System.out.println("Karmię się: ?");
    }

}
