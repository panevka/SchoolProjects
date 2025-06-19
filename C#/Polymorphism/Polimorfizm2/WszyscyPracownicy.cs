using System;

namespace Polimorfizm2;

public class WszyscyPracownicy
{
    static public void KimJestemWZakladzie1(Sekretarka osoba)
    {
        Console.WriteLine("Jestem zatrudniony jako");
        osoba.Pracuj();
        Console.WriteLine("============================");
    }
    
    static public void KimJestemWZakladzie2(Szef osoba)
    {
        Console.WriteLine("Jestem zatrudniony jako");
        osoba.Pracuj();
        Console.WriteLine("============================");
    }
    
    static public void KimJestemWZakladzie(Pracownik osoba)
    {
        Console.WriteLine("Jestem zatrudniony jako");
        osoba.Pracuj();
        if(osoba is Sekretarka) ((Sekretarka)osoba).Pracuj();
        
        else if(osoba is Szef) ((Szef)osoba).Pracuj();
        
        else osoba.Pracuj();
        Console.WriteLine("============================");
    }
    
}