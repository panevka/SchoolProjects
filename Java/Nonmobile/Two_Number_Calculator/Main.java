package com.example.javalib;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner;
        boolean validInput = false;

        while (!validInput) {
            try {

                double result;
                System.out.print("Podaj pierwszą liczbę: ");

                scanner = new Scanner(System.in);
                double num1 = scanner.nextDouble();

                System.out.print("Podaj drugą liczbę: ");
                scanner = new Scanner(System.in);
                double num2 = scanner.nextDouble();

                System.out.print("Podaj znak działania (+, -, *, /): ");
                char operation = scanner.next().charAt(0);

                switch (operation) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("Wynik: " + result);
                        validInput = true;
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println("Wynik: " + result);
                        validInput = true;
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("Wynik: " + result);
                        validInput = true;
                        break;
                    case '/':
                        if (num2 == 0) {
                            throw new ArithmeticException("Błąd dzielenia przez zero.");
                        }
                        result = num1 / num2;
                        System.out.println("Wynik: " + result);
                        validInput = true;
                        break;
                    default:
                        System.out.println("Błąd.");
                        break;
                }
                break;
            } catch (ArithmeticException e) {
                System.out.println("Nie można dzielić przez 0");
            } catch (Exception e) {
                System.out.println("Błąd");
                }


        }
    }
}
