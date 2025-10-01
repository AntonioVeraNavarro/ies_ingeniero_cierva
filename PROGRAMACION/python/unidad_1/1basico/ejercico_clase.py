# Pedir al usuario que introduzca un texto y comprobar si tiene al menos 10 caracteres
# Debe ignorar los espacios en blanco al principio y al final

text = input("Dame un texto: ")

if len(text.strip()) >= 10:
    print("El texto tiene al menos 10 caracteres")
else:
    print("El texto tiene menos de 10 caracteres")