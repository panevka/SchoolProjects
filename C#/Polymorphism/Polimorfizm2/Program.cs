using System;
using System.Collections.Generic;
using Polimorfizm2;

internal class Program
{

    public static void Main(string[] args)
    {
        Pracownik p1 = new Pracownik();
        p1.Pracuj();
        Sekretarka p2 = new Sekretarka();
        p2.Pracuj();
        Szef p3 = new Szef();
        p3.Pracuj();

        Console.WriteLine("Przed rzutowaniem");
        Pracownik p4 = new Pracownik();
        p4.Pracuj();
        Pracownik p5 = new Sekretarka();
        p5.Pracuj();
        Pracownik p6 = new Szef();
        p6.Pracuj();

        Console.WriteLine("Rzutowanie");
        ((Sekretarka)p5).Pracuj();
        ((Szef)p6).Pracuj();

        List<Pracownik> pracownicy = new List<Pracownik> ();
        pracownicy.Add(p1);
        pracownicy.Add(p2);
        pracownicy.Add(p3);
        pracownicy.Add(p4);
        pracownicy.Add(p5);
        pracownicy.Add(p6);
        pracownicy.Add(new Pracownik());
        pracownicy.Add(new Sekretarka());
        pracownicy.Add(new Szef());
            
        Console.WriteLine("ilość pracowników: " + pracownicy.Count);


        foreach (var pracownik in pracownicy)
        {
            pracownik.Pracuj();
        }
        
        foreach (var pracownik in pracownicy)
        {
            Console.WriteLine("Klasa=" + pracownik.GetType());
            if (pracownik is Sekretarka)
            {
                ((Sekretarka)pracownik).Pracuj();
            } else if (pracownik is Szef)
            {
                ((Szef)pracownik).Pracuj();
            }
            else
            {
                pracownik.Pracuj();
            }
        }

        foreach (var pracownik in pracownicy)
        {
            Console.WriteLine("WSZYSCY");
            WszyscyPracownicy.KimJestemWZakladzie(pracownik);
        }
        
       
        
    }
}