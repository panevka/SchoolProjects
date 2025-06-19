namespace Interfejsy;

public class Kot : Zwierze
{
    public void DajGlos()
    {
        Console.WriteLine("Miau miau");
    }

    public void CzymSieZywi()
    {
        Console.WriteLine("Karma");
    }

    public void SrodowiskoZycia()
    {
        Console.WriteLine("Lądowe");
    }

    public bool CzyUdomowione()
    {
        return true;
    }
}