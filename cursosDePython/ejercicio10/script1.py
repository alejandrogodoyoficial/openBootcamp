from tkinter import Tk, StringVar, Radiobutton, Button, Label

def select():
    monitor.config(text=f"{option.get()}")
    print(option.get())
def reset():
    option.set(None)
    monitor.config(text="")

root = Tk()
option = StringVar()
option.set(None)


Radiobutton(root, text="Rojo", variable=option, value='Rojo', command=select).pack()

Radiobutton(root, text="Verde", variable=option, value='Verde', command=select).pack()

Radiobutton(root, text="Azul", variable=option, value='Azul', command=select).pack()

Radiobutton(root, text="Rosa", variable=option, value='Rosa', command=select).pack()

monitor = Label(root)
monitor.pack()
Button(root, text="Reset", command=reset).pack()

root.mainloop()