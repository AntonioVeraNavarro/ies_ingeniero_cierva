continuar = True
while continuar: 
    pos = int(input("Ingrese la posición de la serie Fibonacci que desea calcular: "))
    if pos < 0:
        print("Por favor, ingrese un número entero no negativo.")
        continue
    elif pos == 0:
        print("El número en la posición 0 de la serie Fibonacci es 0.")
    elif pos == 1:
        print("El número en la posición 1 de la serie Fibonacci es 1.")
    else:
        a, b = 0, 1
        for i in range(2, pos + 1):
            aux = a + b
            a = b
            b = aux
        print(f"El número en la posición {pos} de la serie Fibonacci es {b}.")
    while True:
        respuesta = input("¿Desea calcular otro número de la serie Fibonacci? (s/n): ").strip().lower()
        if respuesta == 's':
            break
        elif respuesta == 'n':
            continuar = False
            print("Gracias por usar el programa. ¡Hasta luego!")
            break
        else:
            print("Respuesta no válida. Por favor, ingrese 's' para sí o 'n' para no.")
