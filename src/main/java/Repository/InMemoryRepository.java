package Repository;

import java.util.ArrayList;

/**
 * Se pretende desarrollar una librería que provea a los usuarios de un repositorio genérico de objetos Java.
 * Esta librería debería de ofrecer a los usuarios una clase que permita guardar y leer datos, es decir,
 * cualquier tipo de objeto Java. En particular, debe implementar la operación save (que almacenará un
 * objeto) y fetchAll (que recuperará todos los objetos almacenados).
 */

public class InMemoryRepository<T> {
    private ArrayList<T> objects;

    public InMemoryRepository() {
        this.objects = new ArrayList<T>();
    }

    public void save(T object) {
        this.objects.add(object);
    }

    public ArrayList<T> fetchAll() {
        return this.objects;
    }
}
