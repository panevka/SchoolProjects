namespace Polimorfizm;

public class Zwierze
{
    private int a = 1; 
    internal int b = 2;
    public int c = 3;
    protected int d = 4;
    
    
    virtual public void DajGlos()
    {
        Console.WriteLine("Głos zwierzęcia - nie wiem bo nie wiem jakim jestem zwierzęciem");
    }
    
    virtual public void Zjedz()
    {
        Console.WriteLine("Pokarm - nie wiem bo nie wiem jakim jestem zwierzęciem");
    }

    public Zwierze()
    {
        Console.WriteLine("Jestem zwierzęciem");
    }

    
}