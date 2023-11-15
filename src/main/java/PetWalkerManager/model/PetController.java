package PetWalkerManager.model;

import java.util.List;

public class PetController extends Session{
    private List<Pet> pets;

    public String register(String[] args){
        String view = "01";
        try {
            if(args.length < 2){
                throw new IllegalArgumentException("Invalid number of arguments");
            }
            Pet pet = new Pet(args[0], args[1]);
            if(pets.stream().anyMatch(p -> p.getName().equals(pet.getName()))){
                throw new IllegalArgumentException("Pet already exists");
            }
            pets.add(pet);
        } catch (Exception e) {
            view = e.getMessage();
        }
        return view;
    }
    public String delete(String[] args){
        String view = "01";
        try {
            String petName = args[0];
            Pet pet = pets.stream().filter(p -> p.getName().equals(petName)).findFirst().get();
            pets.remove(pet);
        } catch (Exception e) {
            view = e.getMessage();
        }
        return view;
    }
    public String addStrolls(String[] args){
        String view = "01";
        try {
            String petName = args[0];
            Pet pet = pets.stream().filter(p -> p.getName().equals(petName)).findFirst().get();
            String[] strollArgs = new String[args.length-1];
            if(args.length < 3)
                throw new IllegalArgumentException("Invalid number of arguments");
        } catch (Exception e) {
            view = e.getMessage();
        }
        return view;
    }



}
