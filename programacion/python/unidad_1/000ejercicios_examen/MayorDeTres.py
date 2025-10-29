num1 = int(input("Introduce el primer número: "))
num2 = int(input("Introduce el segundo número: "))
num3 = int(input("Introduce el tercer número: "))

if num1 > num2 and num1 > num3:
    print(f"El número {num1} es el mayor de los 3")
elif num2 > num1 and num2 > num3:
    print(f"El número {num2} es el mayor de los 3")
elif num3 > num1 and num3 > num2:
    print(f"El número {num3} es el mayor de los 3")
elif num1 == num2 and num1 > num3:
    print(f"El primer y segundo número ({num1}) son los mayores e iguales")
elif num2 == num3 and num2 > num1:
    print(f"El segundo y tercer número ({num2}) son los mayores e iguales")
elif num1 == num3 and num1 > num2:
    print(f"El primer y tercer número ({num1}) son los mayores e iguales")
elif num1 == num2 and num1 < num3:
    print(f"El tercer número ({num3}) es el mayor, los otros dos son iguales")
elif num2 == num3 and num2 < num1:
    print(f"El primer número ({num1}) es el mayor, los otros dos son iguales")
elif num1 == num3 and num1 < num2:
    print(f"El segundo número ({num2}) es el mayor, los otros dos son iguales")
else:
    print("Los tres números son iguales")