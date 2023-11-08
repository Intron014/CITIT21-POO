package PetStore;

import java.util.ArrayList;
import java.util.List;

public class PetController {
    private List<Pet> pets;
    private PetView view;
    public PetController(){
        super();
        pets = new ArrayList<>();
        view = new PetView();
    }
    public String createPet(String[] args) throws LeException {
        try {
            Pet newPet = new Pet(args[0], args[1], EMASCOTA.valueOf(args[2]));
            pets.add(newPet);
        } catch (LeException e) {
            throw new RuntimeException(e);
        }
        return "0";
    }

    public String fetchPet(String[] args) throws LeException {


        return "0";
    }
}
