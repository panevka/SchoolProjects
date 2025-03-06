tab = [8,2,1,9,5]
print(tab)

i=1
while i<len(tab):
  key = tab[i]
  j = i-1
  while j>=0 and key < tab[j]:
    tab[j+1] = tab[j]
    j -= 1
  tab[j+1] = key
  i+=1
  print(tab)
