package com.example.javalib;

import java.util.LinkedList;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("test");

        Kot kot = new Kot(20, 3);
        Kot kotDrugi = new Kot(20, 3);

        System.out.println(kot.equals(kotDrugi));

        System.out.println("==========");

        LinkedList<Zwierze> listaZwierzat = new LinkedList<>();
        listaZwierzat.add(new Kot(10, 5));
        listaZwierzat.add(new Pies(30));
        listaZwierzat.add(new Krowa(800));

        Zwierze krowa1 = new Krowa(800);
        Zwierze kot1 = new Kot(10, 5);
        Zwierze pies1 = new Pies(30);

        krowa1.dajGlos();
        krowa1.czymSieKarmie();

        kot1.dajGlos();
        kot1.czymSieKarmie();
        ((Kot) kot1).ileMamLat();


        pies1.dajGlos();
        pies1.czymSieKarmie();

        System.out.println("\n |||============||| \n");
        for (var zwierze :
                listaZwierzat) {
            zwierze.czymSieKarmie();
            zwierze.dajGlos();
            System.out.println("----------");
        }
    }
}