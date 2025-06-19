// See https://aka.ms/new-console-template for more information
using Polimorfizm;

public class Program
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Start");

        // Console.WriteLine("Ini");
        Zwierze zwierze1 = new Zwierze();
        zwierze1.DajGlos();
        zwierze1.Zjedz();
        
        Zwierze kot1 = new Kot();
        kot1.DajGlos();
        kot1.Zjedz();
        Console.WriteLine(kot1);
        
        Zwierze pies1 = new Pies();
        pies1.DajGlos();
        pies1.Zjedz();
        Console.ReadKey();
    }
}
