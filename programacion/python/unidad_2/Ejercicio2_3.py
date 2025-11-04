pos = int(input("Introduce el valor n de la sucesión de Fibonacci: "))

if pos < 0:
    print("La posición debe ser 0 o mayor.")
elif pos == 0:
    print("Posición 0: 0")
elif pos == 1:
    print("Posición 1: 1")
else:
    penultimo = 0
    ultimo =1
    for i in range(2, pos+1):
        aux = ultimo + penultimo
        penultimo = ultimo
        ultimo = aux
    print(f"Posición {pos}: {ultimo}")
print("Fin de programa.")