from pickle import dump, load
class Vehiculo:
  numPuertas = None
  numRuedas = None
  color = None
  def __init__(self, numPuertas, numRuedas, color):
    self.numPuertas = numPuertas
    self.numRuedas = numRuedas
    self.color = color
  def __str__(self):
    return f"Soy color {self.color} con {self.numPuertas} puertas y con {self.numRuedas} ruedas"
auto = Vehiculo(4,4,"Rojo")
#print(auto)
f = open("./vehiculo_auto","w+b")
dump(auto, f)

f.seek(0)
nuevo_auto = load(f)
print(nuevo_auto)
f.close
