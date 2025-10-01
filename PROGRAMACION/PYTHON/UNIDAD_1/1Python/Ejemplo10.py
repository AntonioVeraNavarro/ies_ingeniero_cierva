cadena1 = "Coche"
cadena2 = "    Coche"
print(cadena2)
print(cadena2)
print(cadena2.lower())
print(cadena2.strip())
print(cadena2.upper())
print(cadena2)

if cadena1.lower().strip() == cadena2.lower().strip():
    print("Son iguales")
else:
    print("Son distintos")