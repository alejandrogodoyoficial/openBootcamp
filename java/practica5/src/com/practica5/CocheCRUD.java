package practica5.src.com.practica5;

import java.util.List;

public interface CocheCRUD {

    void save(Coche C);

    List<Coche> findAll();

    Coche findOne(int id);

    Coche Search(String colorAuto);

    void delete(int index);
}