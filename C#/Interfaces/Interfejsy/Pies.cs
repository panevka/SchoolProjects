namespace Interfejsy;

public class Pies : Zwierze
{
    public void DajGlos()
    {
        Console.WriteLine("Hau hau");
    }

    public void CzymSieZywi()
    {
        Console.WriteLine("Mięso");
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