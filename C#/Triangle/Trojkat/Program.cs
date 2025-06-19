namespace Trojkat;

class Program
{
    static void Main(string[] args)
    {
        // Napisz projekt z klasą trójkąt oraz main. Klasa trójkąt ma zawierać 3 pola prywatne, boki: a,b,c. Dostęp do pól
        // zapewnią metody. Customowe get i set. W setterze: jeśli bok <= 0 to bok = 1. Dodatkowo klasa zawiera metody:
        // 1. sprawdzającą czy trójkąt istnieje, 2. obliczająca pole trójkąta (wzór herona na pole trójkąta),
        // 3. obliczająca obwód, 4. sprawdzająca rodzaj trójkąta (ostrokątny, rozwartokątny, prostokątny)
        
        Trojkat trojkat = new Trojkat();
        trojkat.BokA = 1;
        trojkat.BokB = 1;
        trojkat.BokC = 10;
        
        System.Console.WriteLine(trojkat.CzyTrojkatIstnieje());
        System.Console.WriteLine(trojkat.ObwodTrojkata());
        System.Console.WriteLine(trojkat.PoleTrojkata());
        System.Console.WriteLine(trojkat.RodzajTrojkata());
    }
}