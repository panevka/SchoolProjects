namespace Tablice;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Tablice!");
        int[] tablica = { 1, 2, 3 };
        int[] tablica2 = new int[3];

        Console.WriteLine(tablica2.Length);

        for (int i = 0; i < tablica.Length; i++)
        {
            Console.Write($"{tablica[i],4}");
        }

        Console.WriteLine();

        foreach (var element in tablica2)
        {
            Console.Write($"{element,4}");
        }
        // Array tablica1 = new Arr
        Console.WriteLine("=============");
        int[][] t2w = new int[3][];

        t2w[0] = new int[2];
        t2w[1] = new int[3];
        t2w[2] = new int[4];

        int[][] t2w2 = new int[4][];

        for (int i = 0; i < t2w2.Length; i++)
        {
            t2w2[i] = new int[i + 1];

        }

        for (int i = 0; i < t2w2.Length; i++)
        {
            for (int j = 0; j < t2w2[i].Length; j++)
            {
                t2w2[i][j] = i + 1;
                Console.Write($"{t2w2[i][j],4}");
            }
            Console.WriteLine();
        }

        int x = 12;
        int y = 12;
        int z = x;

        Console.WriteLine(x);
        Console.WriteLine(y);
        Console.WriteLine(z);

        z = 40;

        Console.WriteLine(x);
        Console.WriteLine(z);

        Console.WriteLine(x.GetHashCode());
        Console.WriteLine(z.GetHashCode());

        Osoba osoba1 = new Osoba("Jan", "Kowalski");
        Osoba osoba2 = new Osoba("Jan", "Kowalski");
        Osoba osoba3kopia = osoba1;

        Console.WriteLine(osoba1.GetHashCode());
        Console.WriteLine(osoba2.GetHashCode());
        Console.WriteLine(osoba3kopia.GetHashCode());

        // Console.WriteLine(osoba1 == osoba2);
        Console.WriteLine(osoba1.Equals(osoba2));

        String s1 = "Jan";
        String s2 = "Jan";

        Console.WriteLine(s1 == s2);
        Console.WriteLine(s1.Equals(s2));


        String s3 = new String("Jan");
        String s4 = new String("Jan");

        Console.WriteLine(s3 == s4); // nie sprawdza referencji w przeciwieństwie do Javy
        Console.WriteLine(s3.Equals(s4));

    }

    class Osoba
    {
        private string nazwisko;
        private string imie;

        public Osoba(string imie, string nazwisko)
        {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        public override bool Equals(object? obj)
        {
            if (this == obj) return true;

            if (((Osoba)obj).imie == imie && ((Osoba)obj).nazwisko == nazwisko) return true;

            return false;

        }
    }

}
