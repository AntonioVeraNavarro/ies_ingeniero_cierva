edad = int(input("Introduce tu edad: "))
if edad >= 18:
    print("Eres mayor de edad.")
elif edad > 66:
    print("Eres un jubilado.")
elif edad < 0:
    print("Edad no válida.")
else:
    print("Eres menor de edad.")