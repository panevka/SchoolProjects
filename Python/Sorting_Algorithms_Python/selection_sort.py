tab = [8, 2, 1, 9, 5]
print(tab)

i = 0
while i < len(tab) - 1:
    minIndex = i
    j = i + 1
    while j < len(tab):
        if tab[minIndex] > tab[j]:
            minIndex = j
        j+=1
    tab[i], tab[minIndex] = tab[minIndex], tab[i]
    i += 1
    print(tab)



