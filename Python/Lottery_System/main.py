import random
from collections import Counter

while True:
    # losowanie liczb do zgadnięcia
    wylosowane = []
    while len(wylosowane) != 6:
        wylosowana = random.randint(1, 49)
        if wylosowana not in wylosowane:
            wylosowane.append(wylosowana)
    print("Wylosowane liczby:", wylosowane)

    # liczby podane przez użytkownika
    wybrane = []
    while len(wybrane) != 6:
        wybrana = input("Podaj wybrane liczby (pojedynczo):")
        try:
            wybrana = int(wybrana) 
            if wybrana not in wybrane:
                if 1 <= wybrana <= 49:
                    wybrane.append(wybrana)
                else:
                    print("Liczba spoza zakresu 1-49, spróbuj ponownie")
            else:
                print("Liczba się powtarza")
        except ValueError:
            print("Nie podałeś liczby całkowitej")
    print("Wybrane liczby:", wybrane)


    # liczby wspólne
    trafione = set(wybrane) & set(wylosowane)

    liczba_trafien = len(trafione)
    
    trafione_str = ', '.join(map(str, trafione))

    print(f"Oto liczby, które trafiłeś {trafione_str}. Łącznie trafiłeś {liczba_trafien} liczb")
    





