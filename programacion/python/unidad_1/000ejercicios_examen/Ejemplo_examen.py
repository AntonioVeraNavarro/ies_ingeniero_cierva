num1 = int(input("Dime un número: "))

if num1 >= 0:
	print("Es positivo")
else :
	print("Es negativo")

text1 = input("Dame un texto: ")
text1lower = text1.lower()
text1upper = text1.upper()
print("EL texto en minusculas es: ", text1lower)
print("El texto en mayusculas es: ", text1upper)

text2 = input("Dame un texto: ")
print(text2.strip()) # .strip quita espacios al principio y al final

# python no tiene funcion ignorar case (que sepamos)

# "Y" = "and"
# "O" = "or"
# "NO" = "not"
# "igualdad" = "=="
# "distinto" = "!="
# "porcentaje" = "%"

