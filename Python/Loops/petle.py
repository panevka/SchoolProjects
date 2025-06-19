def funkcja(a, b):
        
        c=0
        while a <= b:
            if a!=b:
                print(a, ", ", end = "", sep="")
            else:
                print(a, end=" | ")

            c += a
            a += 1
        print("Suma: ", c)

while True:
    try:
        print("FUNKCJA NR1")
        a = int(input("Podaj pierwszą liczbę\n"))
        b = int(input("Podaj drugą liczbę\n"))
        funkcja(a,b)
        break
    except ValueError:
        print("PODAJ DWIE LICZBY CAŁKOWITE!!!\n")
print("------------------------------------------------")


#================================================================================================

def funkcja2(x, y):


        z = 0
        for x in range(x,y+1):
            if x!=y:
                print(x, ", ", end = "", sep="")
            else:
                print(x, end=" | ")
            z += x
            x += 1

        print("Suma: ", z)

    
while True:
    try:
        print("FUNKCJA NR2")
        x = int(input("Podaj pierwszą liczbę\n"))
        y = int(input("Podaj drugą liczbę\n"))
        funkcja2(x,y)
        break
    except ValueError:
        print("PODAJ DWIE LICZBY CAŁKOWITE!!!\n")
