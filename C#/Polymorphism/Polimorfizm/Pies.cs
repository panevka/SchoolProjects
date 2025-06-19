namespace Polimorfizm;

public class Pies : Zwierze
{
    public Pies()
    {
        Console.WriteLine("Jestem psem");
    }
    
    override public void DajGlos()
    {
        Console.WriteLine("Głos psa - hau hau");
    }
    
    override public void Zjedz()
    {
        Console.WriteLine("Pokarm - mięso/karma dla psów");
    }

}