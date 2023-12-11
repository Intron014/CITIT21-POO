package Repository;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryRepositoryTest {

    @Test
    void save() {
        InMemoryRepository<String> repo = new InMemoryRepository<String>();
        String testObject = "Test";
        repo.save(testObject);
        ArrayList<String> objects = repo.fetchAll();
        assertTrue(objects.contains(testObject));
    }

    @Test
    void fetchAll() {
        InMemoryRepository<String> repo = new InMemoryRepository<String>();
        String testObject1 = "Test1";
        String testObject2 = "Test2";
        repo.save(testObject1);
        repo.save(testObject2);
        ArrayList<String> objects = repo.fetchAll();
        assertTrue(objects.contains(testObject1));
        assertTrue(objects.contains(testObject2));
    }
}