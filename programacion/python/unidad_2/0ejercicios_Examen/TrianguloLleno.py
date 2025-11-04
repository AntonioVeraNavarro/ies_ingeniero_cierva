altura = int(input("indica la altura de un triangulo: "))

texto="\n"

for i in range(1, altura + 1):
    
    texto += "* " * i + "\n"

print(texto)