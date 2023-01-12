countrys = input("Ingrese una lista de paises separados por ','\n")
countrys = countrys.split(",")
countrys = [x.strip() for x in countrys ]
countrys = list(set(countrys))
countrys.sort()
print(countrys)