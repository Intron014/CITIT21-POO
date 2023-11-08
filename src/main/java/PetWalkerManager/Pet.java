package PetWalkerManager;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private Breeds breed;
    private List<Stroll> strolls;

    public Pet(Breeds breed) {
        this.breed = breed;
        strolls = new ArrayList<>();
    }

    public Breeds getBreed() {
        return breed;
    }

    public void setBreed(Breeds breed) {
        this.breed = breed;
    }
}
