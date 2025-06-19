using System;
namespace PolimorfizmZadanie;

public class WszyscyPracownicy
{
    static public void KimJestemWZakladzie(Pracownik osoba)
    {
        Console.WriteLine("Jestem zatrudniony jako");
        osoba.Pracuj();
        Console.WriteLine("============================");
    }
}