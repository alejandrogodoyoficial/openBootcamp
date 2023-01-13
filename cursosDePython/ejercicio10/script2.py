
from tkinter import Tk, StringVar, Listbox, Label, END

master = Tk()
elemento = StringVar()
listbox = Listbox(master)
for item in ["Python", "Go", "Java", "Javascript", "PHP"]:
 listbox.insert(END, item)
listbox.pack()
label = Label(text="Lenguajes de programacion")
label.pack()
master.mainloop()