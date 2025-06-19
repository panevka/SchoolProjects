import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Emerytura {

    public static void emerytura(String nazwaPliku) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(nazwaPliku));
        List<String> kobiety = new ArrayList<>();
        List<String> mezczyzni = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String[] dane = scanner.nextLine().split(" ");
            String imie = dane[0], nazwisko = dane[1], plec = dane[2];
            int wiek = Integer.parseInt(dane[3]);
            int lataDoEmerytury = (plec.equals("K") ? 60 : 65) - wiek;
            String wynik = nazwisko + " " + imie + " " + lataDoEmerytury;
            if (plec.equals("K")) {
                kobiety.add(wynik);
            } else {
                mezczyzni.add(wynik);
            }
        }
        scanner.close();

        zapiszDoPliku("kobiety.txt", kobiety);
        zapiszDoPliku("mezczyzni.txt", mezczyzni);
    }

    private static void zapiszDoPliku(String nazwa, List<String> dane) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File(nazwa));
        for (String line : dane) {
            pw.println(line);
        }
        pw.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        emerytura("pracownicy.txt");
    }
}
