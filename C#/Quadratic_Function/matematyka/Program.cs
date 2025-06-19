namespace matematyka;

class Program
{
    static void Main(string[] args)
    {
        double a = 0;
        double b = 0;
        double c = 0;
        bool isValidInput = false;
       
       
        try
        {
            while (!isValidInput){
            Console.WriteLine("OBLICZANIE FUNKCJI KWADRATOWEJ");
            Console.WriteLine("Podaj wartość współczynnika a");
            a = double.Parse(Console.ReadLine());
            Console.WriteLine("Podaj wartość b (0 jeśli go nie ma)");
            b = double.Parse(Console.ReadLine());
            Console.WriteLine("Podaj wartość c (0 jeśli go nie ma)");
            c = double.Parse(Console.ReadLine());
            isValidInput = true;
            }
            
            double[] result = FunkcjaKwadratowa.znajdz_rozwiazanie(1, -4, 3);
            Console.WriteLine($"Rozwiązania funkcji kwadratowej dla a = {a}, b = {b}, c = {c}" + string.Join(", ", result)); 
        }
        catch (FormatException)
        {
            Console.WriteLine("Podałeś błędną wartość współczynnika");
        }
        
    }
}