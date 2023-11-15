package PetWalkerManager.model;

import java.util.List;
import java.util.Optional;

public class UserController extends Session {
    private RepositoryFile<User> repository;
    private List <User> users;

    public UserController(){
        // repository = new RepositoryFile<User>(a);
    }
    public String register(String[] args){
        String view = "01";
        try {
            User user = new User(args[0], args[1], args[2], Integer.parseInt(args[3]));
            users.add(user);
        } catch (Exception e) {
            view = e.getMessage();
        }
        return view;
    }

    public String assignPet(String[] args){
        String view = "01";
        String userEmail = args[0];
        try{
            User user = users.stream().filter(u -> u.getEmail().equals(userEmail)).findFirst().get();
            Pet pet = new Pet(args[1], args[2]);
            user.getOwnPets().add(pet);
        } catch (Exception e) {
            view = e.getMessage();
        }
        return view;
    }
    public String login(String args[]){
        String view = "01";
        try{
            if(args.length!=2){
                throw new RuntimeException("Invalid number of arguments");
            }
            String userID = args[0];
            String password = args[1];
        } catch(Exception e){
            view = e.getMessage();
        }
        return view;
    }
}
