namespace KlasyAbstrakcyjne;

public abstract class Figura
{
    protected double a;

    public Figura(double a)
    {
        this.a = a;
    }
    public virtual void oFigurze()
    {
        Console.WriteLine("Jestem figurą");
        Console.WriteLine("Pole wynosi: " + Pole());
        Console.WriteLine("Obwód wynosi: " + Obwod());
    }
    public abstract double Pole();
    public abstract double Obwod();
}