package com.example.javalib;

public class Prostokat extends Figura{

    private double b;

    public Prostokat(double a, double b)
    {
        super(a);
        this.b = b;
    }
    public double Pole()
    {
        return a * b;
    }

    public double Obwod()
    {
        return a * 2 + b * 2;
    }

    public void oFigurze()
    {
        System.out.println("Jestem prostokątem");
        super.oFigurze();
    }
    
}
