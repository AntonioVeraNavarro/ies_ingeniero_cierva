lado = int(input("Ingrese la lado del cuadrado: "))

texto = "\n"

for i in range(lado):
	texto += "* " * lado + "\n"
print(texto)