package com.example.javalib;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tablice!");
        
        int[] tablica = {1, 2, 3};
        int[] tablica2 = new int[3];
        for (int i = 0; i < tablica.length; i++)
        {
            System.out.print(tablica[i] + " ");
        }

        System.out.println(" ");

        for (var element : tablica2)
        {
            System.out.print(element + " ");
        }
        System.out.println("---------------");
        int[][] tab2w = new int[3][2];
        for (int i = 0; i < tab2w.length; i++) {
            for (int j = 0; j < tab2w[i].length; j++) {
                tab2w[i][j] = i*j;
//                System.out.print(tab2w[i][j]);
            }
//            System.out.println();
        }

        for (var number:
             tab2w) {
            System.out.println(number);
        }

        String tekst = "tekst";
        String tekst2 = "tekst";
        System.out.println(tekst.hashCode());

        String s1 = "Jan";
        String s2 = "Jan";
        String s3 = new String("Jan");
        String s4 = new String("Jan");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}