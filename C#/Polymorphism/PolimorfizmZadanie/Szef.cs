using System;
namespace PolimorfizmZadanie;

public class Szef:Pracownik
{
    public override void Pracuj()
    {
        Console.WriteLine("Szef.Pracuj()");
    }

    public void Szefuje()
    {
        Console.WriteLine("Szef.szefuje()");
    }
}