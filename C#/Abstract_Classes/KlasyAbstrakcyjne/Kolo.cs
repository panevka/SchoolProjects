namespace KlasyAbstrakcyjne;

public class Kolo : Figura
{
    // private double _promien;
    // public Kolo(double promien)
    // {
    //     _promien = promien;
    // }
    public Kolo(double a) : base(a)
    {
       
    }
    // public override double Pole()
    // {
    //     return Math.PI * Math.Pow(_promien, 2);
    // }
    //
    // public override double Obwod()
    // {
    //     return Math.PI * _promien;
    // }
    
    public override double Pole()
    {
        return Math.PI * Math.Pow(a, 2);
    }
    
    public override double Obwod()
    {
        return Math.PI * a;
    }

    public override void oFigurze()
    {
        Console.WriteLine("Jestem kołem");
        base.oFigurze();
    }
}