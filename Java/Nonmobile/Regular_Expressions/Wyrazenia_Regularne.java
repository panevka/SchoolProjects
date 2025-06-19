import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String kod = "^\\d{2}-\\d{3}$";
        String email = "^([A-Z]*[a-z]*[0-9]*){1,50}@([A-Z]*[a-z]*[0-9]*){1,50}\\.\\w{1,5}$";
        String telefon = "^(\\+?\\d{2}\\s?)?(\\d{3}\\s?){3}$";

        Pattern reKod = Pattern.compile(kod);
        Pattern reEmail = Pattern.compile(email);
        Pattern reTelefon = Pattern.compile(telefon);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj kod pocztowy:");
        String kodInput = scanner.nextLine();
        Matcher mKod = reKod.matcher(kodInput);
        System.out.println("Kod: " + (mKod.matches() ? "poprawnie" : "niepoprawnie"));

        System.out.println("Podaj adres e-mail:");
        String emailInput = scanner.nextLine();
        Matcher mEmail = reEmail.matcher(emailInput);
        System.out.println("Email: " + (mEmail.matches() ? "poprawnie" : "niepoprawnie"));

        System.out.println("Podaj nr telefonu komórkowego:");
        String nrTelefonuInput = scanner.nextLine();
        Matcher mTelefon = reTelefon.matcher(nrTelefonuInput);
        System.out.println("Telefon: " + (mTelefon.matches() ? "poprawnie" : "niepoprawnie"));
    }
}
