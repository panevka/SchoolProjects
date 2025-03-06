tab = [6,5,4,3,2,1]


i = 0
while i < len(tab) - 1:
	j=0
	while j<len(tab) - 1 - i:
		if tab[j] > tab[j+1]:
			tab[j], tab[j+1] = tab[j+1], tab[j]
		j += 1
	i += 1
	print(tab)
