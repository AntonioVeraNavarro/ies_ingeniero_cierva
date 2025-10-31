respuesta = "s"

while (respuesta.lower().strip()) == "s":
    a = float(input("Introduce el primer lado: "))
    b = float(input("Introduce el segundo lado: "))
    c = float(input("Introduce el tercer lado: "))
    
    if a <= 0 or b <= 0 or c <= 0 or a + b <= c or a + c <= b or b + c <= a:
        print("Los lados introducidos no forman un triángulo.")
    elif a == b and b == c:
        print("El triángulo es equilátero.")
    elif a != b and a!= c and b != c:
        print("El triángulo es escaleno.")
    else:
        print("El triángulo es isósceles.")
    
    while True:
        respuesta = input("¿Quieres repetir el programa? (s/n): ")
        if respuesta.lower().strip() in ["s", "n"]:
            break
        print("Entrada no válida. Por favor, responde con 's' o 'n'.")
print("Fin del programa.")