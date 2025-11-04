import math
num1 = int(input("Ingrese el primer número: "))
num2 = int(input("Ingrese el segundo número: "))
esPrimo = True

if num1 < 1 or num2 < 1 or num1 == num2:
    print("Error: Los números deben ser positivos y diferentes.")
else:
    
    menor = min(num1, num2)
    mayor = max(num1, num2)
    print(f"Números primos entre {menor} y {mayor}:")
    
    for i in range(menor, mayor +1):
        esPrimo = True
        raiz = int(math.sqrt(i))
        
        if i == 2:
            print(2)
            continue
        
        if i % 2 == 0:
            continue
        
        for j in range(3, raiz + 2):
            
            if i % j == 0:
                esPrimo = False
                break
            
        if esPrimo and i > 1:
            print(i)
            
print("Fin del programa.")