package Repository;

import java.util.ArrayList;
import java.util.HashMap;

public class IdRepository<T> {
    private HashMap<String, T> objects;

    public IdRepository() {
        this.objects = new HashMap<String, T>();
    }

    public void save(String id, T object) {
        this.objects.put(id, object);
    }

    public ArrayList<T> fetchAll() {
        return new ArrayList<T>(this.objects.values());
    }

    public T fetch(String id) {
        return this.objects.get(id);
    }

    public String fetchId(T object) {
        for (String id : this.objects.keySet()) {
            if (this.objects.get(id).equals(object)) {
                return id;
            }
        }
        return null;
    }

}