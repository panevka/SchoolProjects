namespace KlasyAbstrakcyjne;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Hello, World!");
        // Figura figura = new Figura(); nie można utworzyć instancji klasy abstrakcyjnej

        Kolo kolo1 = new Kolo(10);
        Prostokat prostokat1 = new Prostokat(5, 10);

        kolo1.oFigurze();
        prostokat1.oFigurze();

        Console.ReadKey();

    }
}
