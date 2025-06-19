def cezar_szyfruj(tekst, przesuniecie):
    zaszyfrowany_tekst = ""
    for znak in tekst:
        if znak.isalpha():
            przesuniety = ord(znak) + przesuniecie
            if znak.islower():
                if przesuniety > ord('z'):
                    przesuniety -= 26
                elif przesuniety < ord('a'):
                    przesuniety += 26
            elif znak.isupper():
                if przesuniety > ord('Z'):
                    przesuniety -= 26
                elif przesuniety < ord('A'):
                    przesuniety += 26
            zaszyfrowany_tekst += chr(przesuniety)
        else:
            zaszyfrowany_tekst += znak
    return zaszyfrowany_tekst

def cezar_deszyfruj(tekst, przesuniecie):
    return cezar_szyfruj(tekst, -przesuniecie)

def main():
    nazwa_pliku_wejsciowego = input("Podaj nazwę pliku do szyfrowania/odszyfrowania: ")
    nazwa_pliku_wyjsciowego = input("Podaj nazwę pliku wynikowego: ")
    przesuniecie = int(input("Podaj przesunięcie (liczba całkowita): "))

    with open(nazwa_pliku_wejsciowego, 'r') as plik:
        tekst = plik.read()

    zaszyfrowany_tekst = cezar_szyfruj(tekst, przesuniecie)
    odszyfrowany_tekst = cezar_deszyfruj(zaszyfrowany_tekst, przesuniecie)

    with open(nazwa_pliku_wyjsciowego, 'w') as plik:
        plik.write(zaszyfrowany_tekst)

    print("Zaszyfrowany tekst został zapisany do pliku", nazwa_pliku_wyjsciowego)
    print("Odszyfrowany tekst:", odszyfrowany_tekst)

if __name__ == "__main__":
    main()