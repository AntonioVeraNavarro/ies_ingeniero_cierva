lado = int(input("Ingrese la lado del cuadrado: "))

texto = "\n"

for i in range(lado):
    for j in range(lado):
        if j == lado -1 or j == 0 or i == 0 or i == lado - 1:
            texto += "* "
        else:
            texto += "  "
    texto += "\n"
print(texto)