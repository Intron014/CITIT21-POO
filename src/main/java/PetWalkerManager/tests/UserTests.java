package PetWalkerManager.tests;

import PetWalkerManager.model.*;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;
class UserTests {
    @Test
    void petSaveTest() throws FileNotFoundException {
        Pet pet = new Pet("Siames", "Miau");
        RepositoryFile<Pet> repository = new RepositoryFile<Pet>("./pets.txt");
        repository.save(pet);
    }

}
