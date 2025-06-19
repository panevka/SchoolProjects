namespace Polimorfizm;

public class Kot : Zwierze
{
    
    
    public Kot()
    {
        Console.WriteLine("Jestem kotem");
    }

    public void Wyswietl()
    {
        // Console.WriteLine(a);
        Console.WriteLine(b);
        Console.WriteLine(c);
        Console.WriteLine(d);
        // Console.WriteLine("");
    }
    
    override public void DajGlos()
    {
        Console.WriteLine("Głos kota - miau miau");
    }
    
    override public void Zjedz()
    {
        Console.WriteLine("Pokarm - mleko/myszy/karma dla kotów");
    }

    
}