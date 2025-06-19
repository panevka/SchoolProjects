package com.example.javalib;

public class Main {
    public static void main(String[] args) {
        // Figura figura = new Figura(); nie można utworzyć instancji klasy abstrakcyjnej

        Kolo kolo1 = new Kolo(10);
        Prostokat prostokat1 = new Prostokat(5, 10);

        kolo1.oFigurze();
        prostokat1.oFigurze();

    }
}
