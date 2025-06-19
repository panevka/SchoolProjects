using System;

namespace Polimorfizm2;

public class Szef:Pracownik
{
    public new void Pracuj()
    {
        Console.WriteLine("Szef.Pracuj()");
    }
}