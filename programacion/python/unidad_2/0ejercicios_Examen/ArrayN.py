array = []
longitud = int(input("¿De qué longitud quieres el array? Escribe: "))
for i in range(longitud):
    numero = int(input(f"Introduce el {i + 1}º número: "))
    array.append(numero)
print("El array es:", array)