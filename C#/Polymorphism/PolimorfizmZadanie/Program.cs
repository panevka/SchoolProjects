using System;
using System.Collections.Generic;
using System.Linq;
using PolimorfizmZadanie;

namespace PolimorfizmZadanie;

class Program
{
    static void Main(string[] args)
    {
        
        Pracownik p1 = new Pracownik();
        p1.Pracuj();
        Pracownik p2 = new Sekretarka();
        p2.Pracuj();
        Pracownik p3 = new Szef();
        p3.Pracuj();
        (p3 as Szef).Szefuje();
        ((Szef)p3).Szefuje();

        Console.WriteLine("PORÓWNANIE ================");
        Console.WriteLine(p1.Equals(p2));
        
        WszyscyPracownicy.KimJestemWZakladzie(p1);
        WszyscyPracownicy.KimJestemWZakladzie(p2);
        WszyscyPracownicy.KimJestemWZakladzie(p3);
        Console.WriteLine("---------------------");
        
        List<Pracownik> listaPracownikow = new List<Pracownik>();
        listaPracownikow.Add(p1);
        listaPracownikow.Add(p2);
        listaPracownikow.Add(p3);

        listaPracownikow.Add(new Pracownik());
        listaPracownikow.Add(new Sekretarka());
        listaPracownikow.Add(new Szef());

        Console.WriteLine(listaPracownikow.Count);
        foreach (var pracownik in listaPracownikow)
        {
            pracownik.Pracuj();
        }
        
        // LinkedList<Pracownik> listaPracownikow2 = new LinkedList<Pracownik>();
        // listaPracownikow2.Append()
        // listaPracownikow2.Append()
        // listaPracownikow.
        Console.ReadKey();
        
    }
}