import time
timeNow = [time.localtime()[3], time.localtime()[4]]

if timeNow[0] > 19:
  print("No mas trabajo hasta mañana")
elif timeNow[0] == 19 and timeNow[1] == 0:
  print("Ya se termino el trabajo por hoy")
elif timeNow[0] < 7:
  print("Todavia hay tiempo para descansar")
else:
  print("Es hora de trabajar")
