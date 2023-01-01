// Crea una clase Persona con las siguientes variables:

// La edad

// El nombre

// El teléfono

// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
class Main{
    public static void main(String[] args) {
        Cliente pepe = new Cliente("Pepe", 24, 433234, 449.2);
        System.out.println("Mi nombre es: " + pepe.getNombre());
        System.out.println("Mi edad es: " + pepe.getEdad());
        System.out.println("Mi numero de telefono es: " + pepe.getTelefono());
        System.out.println("Mi credito es: " + pepe.getCredito());

        Trabajador juan = new Trabajador("Juan", 20, 466234, 949.2);
        System.out.println("Mi nombre es: " + juan.getNombre());
        System.out.println("Mi edad es: " + juan.getEdad());
        System.out.println("Mi numero de telefono es: " + juan.getTelefono());
        System.out.println("Mi salario es: " + juan.getSalario());

    }
}