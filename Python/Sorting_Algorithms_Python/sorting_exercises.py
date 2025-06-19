import math

# Zadanie 1
zarobki = [8500, 6400, 2800, 3500, 12870, 3300, 7020, 3000, 8100]

i = 0

while i<len(zarobki)-1:
    j=0
    while j<len(zarobki)-1-i:
        if zarobki[j] > zarobki[j+1]:
            zarobki[j], zarobki[j+1] = zarobki[j+1], zarobki[j]
        j += 1
    i += 1
    print(zarobki[i])

print(zarobki)

print(zarobki[math.floor(len(zarobki)/2)])

# Zadanie 2

zbior = ['a', 'f', 'z', 'b', 'd', 't']
def podziel(tab, start, end):
    os = tab[end]
    low = start
    high = end-1
    
    while True:
        while low <= high and tab[low]<= os:
            low+=1 
        while low <= high and tab[high]>=os:
            high-=1
        if low<=high:
            tab[low], tab[high] = tab[high], tab[low]
        else:
            break
            
    tab[end], tab[low] = tab[low], tab[end]
    return low

def sortowanie(tab, start, end):
    if start<end:
        os = podziel(tab, start, end)
        sortowanie(tab, start, os - 1)
        sortowanie(tab, os+1, end)
        print(zbior)
        
sortowanie(zbior, 0, len(zbior) - 1)
print(zbior)
        


