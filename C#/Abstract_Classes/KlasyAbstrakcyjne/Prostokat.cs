namespace KlasyAbstrakcyjne;

public class Prostokat : Figura
{
    
    // BEZ DZIEDZICZENIA KONSTRUKTORA
    // private double _bok1;
    // private double _bok2;
    
    // public Prostokat(double bok1, double bok2)
    // {
    //     _bok1 = bok1;
    //     _bok2 = bok2;
    // }
    // public override double Pole()
    // {
    //     return _bok1 * _bok2;
    // }
    //
    // public override double Obwod()
    // {
    //     return _bok1 * 2 + _bok2 * 2;
    // }

    // Z DZIEDZICZENIEM KONSTRUKTORA
    private double _b;
    public Prostokat(double a, double b) : base(a)
    {
        _b = b;
    }
    public override double Pole()
    {
        return a * _b;
    }
    
    public override double Obwod()
    {
        return a * 2 + _b * 2;
    }
    
    public override void oFigurze()
    {
        Console.WriteLine("Jestem prostokątem");
        base.oFigurze();
    }
}