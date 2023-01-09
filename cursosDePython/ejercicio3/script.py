weight = float(input("Ingrese su peso en kg, pero solamente el numero\n"))
height = float(input("Ingrese su altura en m, pero solamente el numero,\n"))
bmi = weight / (height ** 2)
print("Tu indice de masa corporal es donde es: {0:.2f}".format(bmi))
