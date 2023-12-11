package Repository;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class IdRepositoryTest {

    @Test
    void saveAndFetchById() {
        IdRepository<String> repo = new IdRepository<>();
        String testObject = "Test";
        String testId = "1";
        repo.save(testId, testObject);
        String fetchedObject = repo.fetch(testId);
        assertEquals(testObject, fetchedObject);
    }

    @Test
    void fetchAllObjects() {
        IdRepository<String> repo = new IdRepository<>();
        String testObject1 = "Test1";
        String testObject2 = "Test2";
        repo.save("1", testObject1);
        repo.save("2", testObject2);
        ArrayList<String> objects = repo.fetchAll();
        assertTrue(objects.contains(testObject1));
        assertTrue(objects.contains(testObject2));
    }

    @Test
    void fetchIdOfObject() {
        IdRepository<String> repo = new IdRepository<>();
        String testObject = "Test";
        String testId = "1";
        repo.save(testId, testObject);
        String fetchedId = repo.fetchId(testObject);
        assertEquals(testId, fetchedId);
    }

    @Test
    void fetchNonExistingId() {
        IdRepository<String> repo = new IdRepository<>();
        String fetchedObject = repo.fetch("1");
        assertNull(fetchedObject);
    }

    @Test
    void fetchIdOfNonExistingObject() {
        IdRepository<String> repo = new IdRepository<>();
        String fetchedId = repo.fetchId("Test");
        assertNull(fetchedId);
    }
}