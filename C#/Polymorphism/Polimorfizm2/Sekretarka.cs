using System;

namespace Polimorfizm2;

public class Sekretarka : Pracownik
{
    public new void Pracuj()
    {
        Console.WriteLine("Sekretarka.Pracuj()");
    }
}