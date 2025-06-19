// See https://aka.ms/new-console-template for more information
using System;
// Zadanie 1
Console.WriteLine("Podaj temperaturę w stopniach Celsjusza");
double temperatureCelsius = Convert.ToDouble(Console.ReadLine());
Console.WriteLine("Oto temperatura w Fahrenheitach: " + (1.8 * temperatureCelsius + 32));

// Zadanie 2
System.Console.WriteLine("Podaj 3 liczby");
System.Console.WriteLine("Liczba 1: ");
int a = Convert.ToInt32(Console.ReadLine());

System.Console.WriteLine("Liczba 2: ");
int b = Convert.ToInt32(Console.ReadLine());

System.Console.WriteLine("Liczba 3: ");
int c = Convert.ToInt32(Console.ReadLine());
int[] tablica = {a,b,c};
Array.Sort(tablica);
System.Console.WriteLine("Największa liczba to: " + tablica[tablica.Length - 1]);

// Zadanie 3
System.Console.WriteLine("Kalkulator BMI");
System.Console.WriteLine("Podaj swoją wagę");
double waga = Convert.ToDouble(Console.ReadLine());
System.Console.WriteLine("Podaj swój wzrost");
int wzrost = Convert.ToInt32(Console.ReadLine());
double bmi = waga/(wzrost*wzrost);
String komunikat = "Prawidłowa waga";
if(bmi < 18.5 && bmi <=24.9){
  komunikat = "niedowaga";
} else if(bmi >24.9){
  komunikat = "nadwaga";
}
System.Console.WriteLine(komunikat);
