class Vehiculo:
  color = None
  ruedas = None
  puertas = None
  def __init__(self, color, ruedas, puertas):
    self.color = color
    self.ruedas = ruedas
    self.puertas = puertas

class Coche(Vehiculo):
  velocidad = None
  cilindrada = None
  def __init__(self, color, ruedas, puertas, velocidad, cilindrada):
    Vehiculo.__init__(self, color, ruedas, puertas)
    self.velocidad = velocidad
    self.cilindrada = cilindrada

myCar = Coche("Gris", 4, 4, 120, 1200)
print("color: ", myCar.color,"\n","ruedas: ", myCar.ruedas,"\n", "puertas: ", myCar.puertas,"\n", "velocidad: ", myCar.velocidad,"\n","cilindrada: ", myCar.cilindrada)
