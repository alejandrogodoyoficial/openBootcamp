package practica5.src.com.practica5;

public class Main {
    public static void main(String[] args) {

        Coche rojo = new Coche("rojo");
        Coche azul = new Coche("azul");
        Coche verde = new Coche("verde");
        Coche violeta = new Coche("violeta");

        CocheCRUD listaCoches = new CocheCRUDImpl();

        listaCoches.save(rojo);
        listaCoches.save(azul);
        listaCoches.save(verde);
        listaCoches.save(violeta);

        System.out.println(listaCoches.findOne(2));
        listaCoches.delete(2);
        System.out.println(listaCoches.findAll());
        System.out.println(listaCoches.Search("rojo"));

    }
}