import java.util.ArrayList;

public class PodstawyCKZ {

  public static void main(String[] args) {
      // Zadanie 1
      int a = 9;
      System.out.println("Czy liczba " + a + " jest parzysta: " + (a%2==0) );

      // Zadanie 2
      int b = 5;
      int c = -9;
      int sum = b > 0 && c>0 ? b+c : 0;
      System.out.println("Suma: " + sum);

      //Zadanie 3
      int num1 = 5;
      int num2 = 4;
      int num3 = 3;
      int[] nums = {(int) Math.pow(num1, 2), (int) Math.pow(num2, 2), (int) Math.pow(num3, 2)};
      boolean czyTrojkaPitagorejska = 
      nums[0] + nums[1] == nums[2] || nums[1] + nums[2] == nums[0] || nums[2] + nums[0] == nums[1];

      //Zadanie 4
      int ocena = 4;
      String ocenaOpisowa =
      switch (ocena){
        case 1 -> "niedostateczny";
        case 2 -> "dostateczny";
        case 3 -> "dopuszczający";
        case 4 -> "dobry";
        case 5 -> "bardzo dobry";
        case 6 -> "celujący";
        default -> "brak";
      };

      //ZADANIE 5
      char kategoria = 'B';
      int godziny = 40;
      int przelicznik = 
      switch(kategoria){
        case 'A' -> 15;
        case 'B' -> 25;
        case 'C' -> 30;
        case 'D' -> 35;
        default -> 0;
      };
      int wyplataNadgodziny = godziny > 40 ? (godziny-40) * przelicznik*2 : 0;
      int wyplataBazowa = godziny * przelicznik;

      float brutto = wyplataBazowa + wyplataNadgodziny;
      int procentPodatku;
      if (brutto>=700){
        procentPodatku=15;
      } else if(brutto>700 && brutto<1200){
        procentPodatku = 20;
      } else{
        procentPodatku = 25;
      }

      double netto = brutto - (brutto * procentPodatku /100.0);

      // Zadanie 6 

      int n = 100;
      System.out.println("Dzielniki (for):");
      for (int i = 1; i <= Math.sqrt(n); i++) {
          if (n % i == 0) {
              System.out.println(i);
              if (i != n / i) {
                  System.out.println(n / i);
              }
          }
      }
      System.out.println("\nDzielniki (while):");
      int i = 1;
      while (i <= Math.sqrt(n)) {
          if (n % i == 0) {
              System.out.println(i);
              if (i != n / i) {
                  System.out.println(n / i);
              }
          }
          i++;
      }

      System.out.println("\nDzielniki (do-while):");
      i = 1;
      do {
          if (n % i == 0) {
              System.out.println(i);
              if (i != n / i) {
                  System.out.println(n / i);
              }
          }
          i++;
      } while (i <= Math.sqrt(n));


      // Zadanie 7 

      int previousNumber = 0;
      int suma = 0;
   do{
    int random = (int) Math.round(Math.random() * 19) + 1; 
    if(random == previousNumber){
      break;
    }
    suma += random;
    previousNumber = random;
   } while(true);

// ZADANIE 8 

int sumaDzielnikow = 0;

        for (int y = 1; y <= n / 2; y++) {
            if (n % i == 0) {
                sumaDzielnikow += y; 
            }
        }
        System.out.println("Suma dzielników " + sumaDzielnikow);
  }
}

