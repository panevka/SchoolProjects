namespace Trojkat;

public class Trojkat
{
    private int _bokA;
    private int _bokB;
    private int _bokC;

    public int BokA
    {
        get => _bokA;
        set => _bokA = walidacjaTrojkata(value);
    }
    
    public int BokB
    {
        get => _bokB;
        set => _bokB = walidacjaTrojkata(value);
    }
    
    public int BokC
    {
        get => _bokC;
        set => _bokC = walidacjaTrojkata(value);
    }
    
    private int walidacjaTrojkata(int bok)
    {
        return bok == 0 ? 1 : bok;
    }
    
    public double PoleTrojkata()
    {
        if (CzyTrojkatIstnieje())
        {
            double polowaObwodu = 0.5 * (BokA + BokB + BokC);
            return Math.Round(Math.Sqrt(polowaObwodu*(polowaObwodu-BokA)*(polowaObwodu-BokB)*(polowaObwodu-BokC)), 3);
        }

        return 0;
    }
    
    public double ObwodTrojkata()
    {
        if(CzyTrojkatIstnieje()) return BokA + BokB + BokC;

        return 0;
    }
    
    public bool CzyTrojkatIstnieje()
    {
        return BokB + BokC > BokA && BokA + BokC > BokB && BokA + BokB > BokC;
    }

    public String RodzajTrojkata()
    {
        if (CzyTrojkatIstnieje())
        {
            double katAlfa = Math.Acos((Math.Pow(BokB, 2) + Math.Pow(BokC, 2) - Math.Pow(BokA, 2)) / (2 * BokB * BokC));
            double katBeta = Math.Acos((Math.Pow(BokA, 2) + Math.Pow(BokC, 2) - Math.Pow(BokB, 2)) / (2 * BokA * BokC));
            double katGamma = Math.Acos((Math.Pow(BokA, 2) + Math.Pow(BokB, 2) - Math.Pow(BokC, 2)) / (2 * BokA * BokB));

            katAlfa = katAlfa * (180 / Math.PI);
            katBeta = katBeta * (180 / Math.PI);
            katGamma = katGamma * (180 / Math.PI);
        
            string rodzajTrojkata;
            double[] katy = {katAlfa, katBeta, katGamma};

            for (int i = 0; i < katy.Length; i++)
            {
                if (katy[i] == 90)
                {
                    return "prostokątny";
                }
                if(katy[i] > 90 && katy[i] < 180)
                {
                    return "rozwartokątny";
                } 
            }

            return "ostrokątny";
        }
        else
        {
            return "brak";
        }
        
    }
}