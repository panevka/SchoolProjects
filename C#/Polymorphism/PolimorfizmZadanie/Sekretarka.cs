using System;

namespace PolimorfizmZadanie;

public class Sekretarka : Pracownik
{
    public override void Pracuj()
    {
        Console.WriteLine("Sekretarka.Pracuj()");
    }
}