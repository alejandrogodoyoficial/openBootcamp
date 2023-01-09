class Alumno:
  nombre = None
  nota = None
  def __init__(self, nombre, nota):
    self.nombre = nombre
    self.nota = nota
  def aAprobado(self):
    if self.nota >= 6:
      print("El alumno ", self.nombre, "aprobo con ", self.nota)
    else:
      print("El alumno ", self.nombre, "no aprobo porque su nota fue un ", self.nota)

alumno1 = Alumno("Juan", 8)
alumno2 = Alumno("jorge", 5)
alumno3 = Alumno("Micaela", 6)
alumno4 = Alumno("Alex", 2)

alumno1.aAprobado()
alumno2.aAprobado()
alumno3.aAprobado()
alumno4.aAprobado()
