
package practica5.src.com.practica5;

import java.util.ArrayList;

public class CocheCRUDImpl implements CocheCRUD {

    ArrayList<Coche> coches = new ArrayList<>();

    @Override
    public void save(Coche c) {
        coches.add(c);

    }

    @Override
    public ArrayList<Coche> findAll() {
        return coches;
    }

    @Override
    public void delete(int index) {
        coches.remove(index);

    }

    @Override
    public Coche findOne(int id) {
        return coches.get(id);
    }

    @Override
    public Coche Search(String colorAuto) {
        for (Coche element : coches) {

            if (colorAuto == element.color) {
                return element;
            }

        }
        return null;
    }

    @Override
    public String toString() {
        return coches.toString();
    }

}