text_file = open("./archivo.txt",  "w+")
text_file.write("Hola mundo")
print(text_file.readline())
text_file.close()
text_file =open("./archivo.txt", "r")
print(text_file.readline())