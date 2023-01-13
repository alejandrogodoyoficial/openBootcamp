import sqlite3

conn = sqlite3.connect("alumnos.db")

cursor = conn.cursor()

cursor.execute("CREATE TABLE alumnos (id INTEGER PRIMARY KEY, nombre VARCHAR(50), apellido VARCHAR(50))")

cursor.execute(f'INSERT INTO alumnos(id, nombre, apellido) VALUES(1, "Gustavo", "Leon")')
cursor.execute(f'INSERT INTO alumnos(id, nombre, apellido) VALUES(2, "Lucas", "Gomez")')
cursor.execute(f'INSERT INTO alumnos(id, nombre, apellido) VALUES(3, "Micaela", "Flores")')
cursor.execute(f'INSERT INTO alumnos(id, nombre, apellido) VALUES(4, "Kevin", "Dominguez")')
cursor.execute(f'INSERT INTO alumnos(id, nombre, apellido) VALUES(5, "Julian", "Torres")')
cursor.execute(f'INSERT INTO alumnos(id, nombre, apellido) VALUES(6, "Alexis", "Sosa")')
cursor.execute(f'INSERT INTO alumnos(id, nombre, apellido) VALUES(7, "Florencia", "Becerra")')
cursor.execute(f'INSERT INTO alumnos(id, nombre, apellido) VALUES(8, "Micaela", "Gomez")')

conn.commit()

rows = cursor.execute("SELECT * FROM alumnos")
for i in rows:
    print(i)
cursor.close()
conn.close()
