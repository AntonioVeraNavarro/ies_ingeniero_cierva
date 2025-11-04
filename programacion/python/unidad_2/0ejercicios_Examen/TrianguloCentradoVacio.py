altura = int(input("Ingrese la altura del triángulo: "))

texto = "\n"

for i in range(0, altura):
	for j in range(0, ((altura * 2) - 1)):
		if j == altura - i -1 or j == altura + i -1 or i == altura -1:
			texto += "* "
		else:
			texto += "  "
	texto += "\n"
print(texto)