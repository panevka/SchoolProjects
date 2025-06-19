using System;
namespace PolimorfizmZadanie;

public class Pracownik
{
    public virtual void Pracuj()
    {
        Console.WriteLine("Pracownik.Pracuj()");
    }
}