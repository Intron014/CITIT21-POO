package PetWalkerManager.model;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private Breeds breed;
    private List<Stroll> strolls;

    public Pet(String breed, String name) {
        this.name = name;
        this.breed = Breeds.valueOf(breed);
        strolls = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breeds getBreed() {
        return breed;
    }

    public void setBreed(Breeds breed) {
        this.breed = breed;
    }
}
