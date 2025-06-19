package com.example.javalib;

public class Kolo extends Figura {
//    private double _promien;
//    public Kolo(double promien)
//    {
//        _promien = promien;
//    }
    public Kolo(double a){
        super(a);
    }
    public double Pole()
    {
        return Math.PI * Math.pow(a, 2);
    }

    public double Obwod()
    {
        return Math.PI * a;
    }

    public void oFigurze()
    {
        System.out.println("Jestem kołem");
        super.oFigurze();
    }
}
