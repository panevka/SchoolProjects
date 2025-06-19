package com.example.javalib;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TabliczkaMnozenia {

    public static void main(String[] args) {

        Scanner scanner;
        boolean userExit = false;


        while(!userExit) {
            int a = 0, b = 0;

            while (a <= 0 || a > 10) {
                try {
                    System.out.println("Wpisz liczbę a <1,10>");
                    scanner = new Scanner(System.in);
                    a = scanner.nextInt();
                    if (a <= 0 || a > 10)
                        throw new NumberMisinput("Liczba nie jest z zakresu <1,10>");

                } catch (NumberMisinput e) {
                    System.out.println("Błąd wprowadzania: " + e.getMessage());
                }  catch (InputMismatchException e) {
                    System.out.println("Błąd wprowadzania. Nie została podana liczba. ");
                    a = 0;
                }  catch (Exception e) {
                    System.out.println("Błąd: " + e.getLocalizedMessage());
                }
            }

            while (b <= 0 || b > 10) {
                try {
                    System.out.println("Wpisz liczbę b <1,10>");
                    scanner = new Scanner(System.in);
                    b = scanner.nextInt();
                    if (b <= 0 || b > 10)
                        throw new NumberMisinput("Liczba nie jest z zakresu <1,10>");

                } catch (NumberMisinput e) {
                    System.out.println("Błąd wprowadzania: " + e.getMessage());
                }  catch (InputMismatchException e) {
                    System.out.println("Błąd wprowadzania. Nie została podana liczba. ");
                    b = 0;
                }  catch (Exception e) {
                    System.out.println("Błąd: " + e.getLocalizedMessage());
                }
            }



            System.out.println("Wynik mnożenia liczb " + a + " oraz " + b + ": " + (a*b));
            String answer;
            while(true){
                System.out.println("Czy chcesz powtórzyć działanie programu? (y/n)");
                scanner = new Scanner(System.in);
                answer = scanner.nextLine();
                if(answer.equals("n")){
                    userExit = true;
                    break;
                } else if (answer.equals("y")) {
                    break;
                }

            }

        }

    }

}
