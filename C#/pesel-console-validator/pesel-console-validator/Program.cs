namespace pesel_console_validator;

class Program
{
    static void Main(string[] args)
    {
        while (true)
        {
            Console.Write("Enter PESEL (11 digits): ");
            string pesel = Console.ReadLine()?.Trim();

            bool checksumOk = IsChecksumValid(pesel);
            bool peselLengthOk = pesel.Length == 11;
            bool isNumeric = long.TryParse(pesel, out _);

            if (!checksumOk || !peselLengthOk || !isNumeric)
            {
                Console.WriteLine("Invalid PESEL format. Please try again.\n");
                continue;
            }

            char gender = GetGender(pesel);
            Console.WriteLine(gender == 'K' ? "Kobieta" : "Mężczyzna");

            Console.Write("Do you want to check another PESEL? (y/n): ");
            string answer = Console.ReadLine()?.ToLower();
            if (answer != "y")
                break;

            Console.WriteLine();
        }
    }

    static char GetGender(string pesel)
    {
        int genderDigit = pesel[9] - '0';
        return genderDigit % 2 == 0 ? 'K' : 'M';
    }

    static bool IsChecksumValid(string pesel)
    {
        int[] weights = { 1, 3, 7, 9, 1, 3, 7, 9, 1, 3 };
        int sum = 0;

        for (int i = 0; i < 10; i++)
        {
            int digit = pesel[i] - '0';
            sum += digit * weights[i];
        }

        int m = sum % 10;
        int r = (m == 0) ? 0 : 10 - m;

        int controlDigit = pesel[10] - '0';
        return r == controlDigit;
    }

}
