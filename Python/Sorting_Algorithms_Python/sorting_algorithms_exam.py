# Napisz program, który stworzy tablice, posortuje ją algorytmem sortowania bąbelkowego, a następnie wypisze jej zawartość. Możesz wypisywać zawartość tablicy z poziomu użytkownika
# zad 2
# Napisz program, który stworzy tablice statyczną, posortuje ją algorytmem sortowania szybkiego, a
#
# następnie wypisze jej zawartość.
#
# zad 3
# Napisz program, który stworzy tablice statyczną, posortuje ją algorytmem sortowania przez wstawianie,
#
# a następnie wypisze jej zawartość. Możesz wypisywać zawartość tablicy po każdym przebiegu głównej pętli.


def exercise1():
    print("---- ZADANIE NR 2 ---------")

    num_amount = 0
    num_list = []

    while num_amount < 2:
        try:
            num_amount = int(input("Ile liczb chcesz wpisać? \n"))
        except Exception:
            print("Błąd, musi zostać podana liczba")

    while len(num_list) != num_amount:
        try:
            num = int(input("Podaj liczbę \n"))
            num_list.append(num)
        except Exception:
            print("Błąd, musi zostać podana liczba")

    for i in range(len(num_list)):
        for j in range(len(num_list) - 1 - i):
            if num_list[j] > num_list[j+1]:
                num_list[j], num_list[j+1] = num_list[j+1], num_list[j]
            j += 1
        i += 1
        print(num_list)


def exercise2():
    print("---- ZADANIE NR 2 ---------")

    def p(arr, left, right): 
        i = left
        j = right
        pv = arr[right]

        while i < j:
            while i < right and arr[i] < pv:
                i += 1
            while j > left and arr[j] >= pv:
                j -= 1
            if i < j:
                arr[i], arr[j] = arr[j], arr[i]

        if arr[i] > pv:
            arr[i], arr[right] = arr[right], arr[i]

        return i

    def quicksort(arr, left, right):
        if left < right:
            p_pos = p(arr, left, right)
            quicksort(arr, left, p_pos - 1)
            quicksort(arr, p_pos + 1, right)

    num_list = [10, 99, 100, 64, 15, 1, 8, 57]

    print("Początkowa lista", num_list)
    quicksort(num_list, 0, len(num_list) - 1)
    print("Posortowana lista", num_list)

def exercise3():
    print("------- ZADANIE NR 3 -----------")
    num_list = [10, 99, 100, 64, 15, 1, 8, 57]
    print("Początkowa lista", num_list)

    for i in range(len(num_list)):
        print("Iteracja", i, ": ", num_list)
        k = num_list[i]
        j = i - 1

        while j>=0 and k < num_list[j]:
            num_list[j+1] = num_list[j]
            j -= 1
        num_list[j+1] = k

def main():
    exercise1()
    exercise2()
    exercise3()

main()
