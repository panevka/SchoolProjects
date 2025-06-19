// See https://aka.ms/new-console-template for more information
using System.Text.RegularExpressions;

internal class Program
{
    private static void Main(string[] args)
    {
        Console.WriteLine("Wyrażenia regularne");

        string wyrazenieRegularne = "^\\w{2}\\d{2,3}c$";

        wyrazenieRegularne = @"\w{2}\d{2,3}c";


        Regex re = new Regex(wyrazenieRegularne);


        Console.WriteLine("Czy ciąg zawiera " + wyrazenieRegularne);
        string tekst = "1a333c_2a222c";

        Console.WriteLine(re.IsMatch(tekst));

        // Console.WriteLine(re.Match(tekst));

        MatchCollection mc = Regex.Matches(tekst, wyrazenieRegularne);
        foreach (var znalezione in Regex.Matches(tekst, wyrazenieRegularne))
        {
            Console.WriteLine("Matched " + znalezione);
        }

        // Napisz program, który sprawdza poprawność wprowadzonego przez użytkownika
        // 1. Kodu pocztowego
        // 2. Adresu e-mail
        // 3. Polskiego telefonu komórkowego (kierunkowy opcjonalnie, po 3 cyfrach i 
        // kierunkowym opcjonalnie)
        // Pokazuje jedynie komunikat "poprawnie" lub "niepoprawnie".

        Regex reKod = new Regex(@"^\d{2}-\d{3}$");
        Regex reEmail = new Regex(@"^([A-Z]*[a-z]*[0-9]*){1,50}@([A-Z]*[a-z]*[0-9]*){1,50}\.\w{1,5}$");
        Regex reTelefon = new Regex(@"^(\+?\d{2}\s?)?(\d{3}\s?){3}$");

        // 48 123123123
        // + 48 123123123
        // 123123123

        // + 123123123
        Console.WriteLine("Podaj kod pocztowy");
        string kodPocztowy = Console.ReadLine();
        Console.WriteLine("Kod: " + (reKod.IsMatch(kodPocztowy) ? "poprawnie" : "niepoprawnie"));

        Console.WriteLine("Podaj adres e-mail");
        string email = Console.ReadLine();
        Console.WriteLine("Email: " + (reEmail.IsMatch(email) ? "poprawnie" : "niepoprawnie"));

        Console.WriteLine("Podaj nr telefonu komórkowego");
        string nrTelefonu = Console.ReadLine();
        Console.WriteLine("Telefon: " + (reTelefon.IsMatch(nrTelefonu) ? "poprawnie" : "niepoprawnie"));

    }
}
