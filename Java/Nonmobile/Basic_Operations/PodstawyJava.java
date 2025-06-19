package com.example.javalib;

import java.util.Scanner;

public class PodstawyJava {
    public static void main(String[] args) {

        //ZAD 1
        System.out.println("ZADANIE 1");
        System.out.println("Ania");
        System.out.println("Bartek");
        System.out.println("Kasia");
        System.out.println("\n--------------\n");

        //ZAD 2
        System.out.println("ZADANIE 2");
        final String zmienna1 = "abc";
        final int zmienna2 = 111;
        final String zmienna3 = "def";

        System.out.println(zmienna1);
        System.out.println(zmienna2);
        System.out.println(zmienna3);

        String str1 = "aaa";
        String str2 = "bbb";
        String str3 = "ccc";
        String str4 = str1+str2+str3;

        System.out.println(str4.substring(0,3));
        System.out.println(str4.substring(2,5));
        System.out.println(str4.substring(5,8));
        System.out.println("\n--------------\n");


        // ZAD 3
        System.out.println("ZADANIE 3");

        double a = 5.5;
        double b = 4.5;
        double c = 9.0;
        System.out.println("(a+b)*c = " + (a+b) * c);
        System.out.println("(a-b)/c = " + (a-b) / c);
        a++; b++; c++;
        System.out.println("czy a+b > c? " + (a+b>c));
        System.out.println("czy a jest równe b? " + (a==b));
        System.out.println("\n--------------\n");


        //ZAD 4
        System.out.println("ZADANIE 4");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int liczba2 = scanner.nextInt();

        String wynik = liczba1 == liczba2 ? "Te liczby są sobie równe" : "Te liczby nie są sobie równe";
        System.out.printf("Podane przez ciebie liczby to: " + liczba1 + " oraz " + liczba2);
        System.out.println(wynik);
        System.out.println("\n--------------\n");

        //ZAD 5
        System.out.println("ZADANIE 5");
        scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        liczba1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        liczba2 = scanner.nextInt();
        int temp = 0;
        System.out.printf("Podane przez ciebie liczby to: " + liczba1 + " oraz " + liczba2);
        while (liczba1 % liczba2 != 0){

           temp = liczba1 % liczba2;
           liczba1 = liczba2;
           liczba2 = temp;

        }

        System.out.println("\nNajwiększy wspólny dzielnik (NWD) tych liczb to: " + liczba2);
        System.out.println("\n--------------\n");
    }
}
