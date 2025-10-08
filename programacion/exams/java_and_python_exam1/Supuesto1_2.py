# Supuesto1_2.py
# El programa pide por consola al usuario 2 numeros, 
# y mas tarde muestra por consola algunas operaciones hechas a partir de ellos.
# Antonio Vera Navarro 08/10/25
 
priceperunit = float(input("Precio por producto (unidad): "))

stock = int(input("Stock de unidades: "))

# TAMBIÉN SE PUEDE HACER ASÍ

# preciototal = priceperunit * stock
# preciototalsiniva = (priceperunit * stock) - (((priceperunit * stock) * 21) / 100)
# ivatotal = ((priceperunit * stock) * 21) / 100

if (priceperunit <= 0) or (stock <= 0):
	print("Has introducido algun valor igual o menor a 0 y eso no es posible, vuelva a intentarlo.")
else :
	print("El precio por unidad es:", priceperunit) # forma 1
	print("El stock de unidades es: " + str(stock)) # forma 2
	print(f"El precio total es: {priceperunit * stock}") # forma 3
	print("El precio total sin IVA es:", (priceperunit * stock) - (((priceperunit * stock) * 21) / 100))
	print("El IVA total es", ((priceperunit * stock) * 21) / 100)

