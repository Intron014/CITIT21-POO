package Repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class DiskRepositoryTest {
    private DiskRepository<String> diskRepository;
    private final String filePath = "/home/bt0354/Documents/UPM/CITIT21-POO/src/main/java/Repository/testFile.ser";

    @BeforeEach
    void setUp() throws IOException {
        diskRepository = new DiskRepository<>(filePath);
        // Start with a clean file
        File file = new File(filePath);
        file.createNewFile();
    }

    @Test
    void saveObjectToFile() {
        String testObject = "Test String";
        diskRepository.save(testObject);
        ArrayList<String> objects = diskRepository.fetchAll();
        assertTrue(objects.contains(testObject));
    }

    @Test
    void fetchAllObjectsFromFile() {
        String testObject1 = "Test String 1";
        String testObject2 = "Test String 2";
        diskRepository.save(testObject1);
        diskRepository.save(testObject2);
        ArrayList<String> objects = diskRepository.fetchAll();
        assertTrue(objects.contains(testObject1));
        assertTrue(objects.contains(testObject2));
    }

    @Test
    void clearObjectsFromFile() {
        String testObject = "Test String";
        diskRepository.save(testObject);
        File file = new File(filePath);
        assertTrue(file.exists());
        file.delete();
        ArrayList<String> objects = diskRepository.fetchAll();
        assertFalse(objects.contains(testObject));
    }

    @Test
    void fetchFromEmptyFile() {
        File file = new File(filePath);
        file.delete();
        ArrayList<String> objects = diskRepository.fetchAll();
        assertTrue(objects.isEmpty());
    }
}