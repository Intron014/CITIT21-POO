package PetWalkerManager.model;

import java.util.List;

public class UserController extends Session {

    private List <User> users;

    public UserController(){

    }

    public String register(String[] args){
        try {
            User user = new User(args[0], args[1], args[2], Integer.parseInt(args[3]));
            users.add(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return view;
    }

    public String assignPet(String[] args){
        String userEmail = args[0];
        try{
            User user = users.stream().filter(u -> u.getEmail().equals(userEmail)).findFirst().get();
            Pet pet = new Pet(args[1], args[2]);
            user.getOwnPets().add(pet);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return view;
    }


}
