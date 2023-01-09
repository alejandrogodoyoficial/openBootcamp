def  leapYear(year):
	if (year % 4 == 0 and year % 100 != 0 and year % 400 != 0)  or (year % 4 == 0 and year % 100 == 0 and year % 100 == 0):
		print(year, "es bisiesto")
		return f"{year} es bisisesto"
	else:
		print(year, "no es bisiesto")
		return f"{year} no es bisiesto"

while True:
	x = input("Engrese un anio para saber si es bisiesto o cualquier letra para salir:\n")
	try:
		if type(int(x)) == int:
			leapYear(int(x))
	except:
		break
