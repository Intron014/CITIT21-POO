package UPMToDo.controller;

import UPMToDo.model.User;
import UPMToDo.repository.UserRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class UserController {
    private UserRepository users;
    protected User currentUser = null;

    public UserController(UserRepository users) {
        this.users = users;
    }

    public String registerUser(String args[]){
        String result = "";
        try{
            if(args.length < 5){
                throw new Exception("Invalid number of arguments");
            }
            if(!Pattern.matches(".*@upm.es$", args[3])){
                throw new Exception("Invalid email");
            }
        } catch (Exception e){
            result = e.getMessage();
        }
        users.save(new User(args[1], args[2], args[3], LocalDate.parse(args[4])));

        return result;
    }

    public String loginUser(String args[]){
        String result = "";
        try{
            if(args.length < 3){
                throw new Exception("Invalid number of arguments");
            }
        } catch (Exception e){
            result = e.getMessage();
        }
        try{
            User usernow = users.fetch(args[1], args[2]);
            if(usernow == null){
                throw new Exception("User not found");
            }
            currentUser = usernow;
        } catch (Exception e){
            result = e.getMessage();
        }
        return result;
    }

    public String logoutUser(){
        String result = "";
        try{
            if(currentUser == null){
                throw new Exception("No user logged in");
            }
        } catch (Exception e){
            result = e.getMessage();
        }
        currentUser = null;
        return result;
    }
}
