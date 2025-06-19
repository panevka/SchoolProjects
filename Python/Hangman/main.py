import re
import random

wisielce = ['''
  +---+
  |   |
      |
      |
      |
      |
=========''', '''
  +---+
  |   |
  O   |
      |
      |
      |
=========''', '''
  +---+
  |   |
  O   |
  |   |
      |
      |
=========''', '''
  +---+
  |   |
  O   |
 /|   |
      |
      |
=========''', '''
  +---+
  |   |
  O   |
 /|\  |
      |
      |
=========''', '''
  +---+
  |   |
  O   |
 /|\  |
 /    |
      |
=========''', '''
  +---+
  |   |
  O   |
 /|\  |
 / \  |
      |
=========''']


slowa = ["podmiot liryczny", "aplikacja", "system"]

slowo = random.choice(slowa)

liczba_prob = 0
haslo = re.sub(r'[^ ]', "*", slowo)

print(haslo)


odgadniete_litery = []

while haslo != slowo and liczba_prob < len(wisielce) - 1:
    print(wisielce[liczba_prob])
    print("Aktualny stan hasła: ", haslo)
    proba = input("Zgadnij literę lub całe hasło: ")

    if proba == slowo:
        haslo = slowo
        print("Gratulacje, wygrałeś! Odkryte hasło to: ", slowo)
        break
    elif len(proba) == 1 and proba in slowo:
        odgadniete_litery.append(proba)
        haslo = ''.join([litera if litera in odgadniete_litery or litera == ' ' else '*' for litera in slowo])
    else:
        print("Źle odgadnięte hasło/litera" )
        liczba_prob += 1

    if haslo == slowo:
        print("Gratulacje, wygrałeś! Odkryte hasło to: ", slowo)
        break

if haslo != slowo:
    print(wisielce[liczba_prob])
    print("Niestety przegrałeś! Prawidłowe hasło to: ", slowo)
