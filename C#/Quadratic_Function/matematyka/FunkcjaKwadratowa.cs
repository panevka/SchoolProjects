using System.Collections;

namespace matematyka;

public class FunkcjaKwadratowa
{
    public static double[] znajdz_rozwiazanie(int a, int b, int c)
    {
        int delta = oblicz_delte(a, b, c);
        return oblicz_miejsca_zerowe(delta, a, b);
    }
    
    public static int oblicz_delte(int a, int b, int c)
    {
        return b * b - (4 * a * c);
    }

    public static double[] oblicz_miejsca_zerowe(int delta, int a, int b)
    {
        if (delta >= 0)
        {
           double x1 = (-b + Math.Sqrt(delta)) / (2 * a);
           double x2 = (-b - Math.Sqrt(delta)) / (2 * a);
           
           return delta == 0 ? new double[] { x1 } : new double[] { x1, x2 };

        }

        return new double[0];
    }
}