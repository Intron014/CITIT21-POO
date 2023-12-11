package Repository;

import java.io.*;
import java.util.ArrayList;

public class DiskRepository<T> implements Serializable {
    private String filePath;

    public DiskRepository(String filePath) {
        this.filePath = filePath;
    }

    public void save(T object) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath, true))) {
            out.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<T> fetchAll() {
        ArrayList<T> objects = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            while (true) {
                T object = (T) in.readObject();
                if (object == null) break;
                objects.add(object);
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objects;
    }
}