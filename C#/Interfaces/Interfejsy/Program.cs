namespace Interfejsy;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Interfejsy");

        Kot kot1 = new Kot();

        Console.WriteLine(kot1.CzyUdomowione());
        kot1.DajGlos();
        kot1.SrodowiskoZycia();
        kot1.CzymSieZywi();

        Console.ReadKey();

        Kot pies1 = new Kot();

        Console.WriteLine(pies1.CzyUdomowione());
        pies1.DajGlos();
        pies1.SrodowiskoZycia();
        pies1.CzymSieZywi();

        Console.ReadKey();
    }
}
