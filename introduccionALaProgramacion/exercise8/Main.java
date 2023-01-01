// Para practicar la encapsulación:

// Crear clase Persona.

// Crear variables las privadas edad, nombre y telefono de la clase Persona.

// Crear gets y sets de cada propiedad.

// Crear un objeto persona en el main.

// Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

class Main{
    public static void main(String[] args) {
    Persona pepe = new Persona("Pepe", 30, 1234123);
    System.out.println(pepe.getNombre());
    System.out.println(pepe.getEdad());
    System.out.println(pepe.getTelefono());
    
    pepe.setNombre("Pepe Grillo");
    pepe.setEdad(20);
    pepe.setTelefono(34155545);

    System.out.println(pepe.getNombre());
    System.out.println(pepe.getEdad());
    System.out.println(pepe.getTelefono());


    }
}
class Persona{
    private String nombre;
    private int edad;
    private int telefono;

    public Persona(String nombre, int edad, int telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

}