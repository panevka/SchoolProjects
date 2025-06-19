package com.example.javalib;

public abstract class Figura {

    double a; // musi być dziedziczone
    public Figura(double a){
        this.a = a;
    }
    public void oFigurze()
    {
        System.out.println("Jestem figurą");
        System.out.println("Pole wynosi: " + Pole());
        System.out.println("Obwód wynosi: " + Obwod());
    }

    public abstract double Pole();
    public abstract double Obwod();
}
