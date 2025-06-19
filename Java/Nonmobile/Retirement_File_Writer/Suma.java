import java.io.*;
import java.util.*;

public class Suma {

    public static void sumujIZapisz(String nazwaPliku) throws IOException {
        File file = new File(nazwaPliku);
        int suma = 0;

        if (file.exists()) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                suma += Integer.parseInt(scanner.nextLine());
            }
            scanner.close();
        }

        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        pw.println(suma);
        pw.close();
    }

    public static void main(String[] args) throws IOException {
        sumujIZapisz("liczby.txt");
    }
}
