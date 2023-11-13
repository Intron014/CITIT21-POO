package PetWalkerManager.model;

import java.util.List;

public class PetController extends Session{
    private List<Pet> pets;

    public String register(String[] args){
        try {
            Pet pet = new Pet(args[0], args[1]);
            pets.add(pet);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return view;
    }


}
