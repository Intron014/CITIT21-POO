package UPMToDo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class UserController {
    private List<User> users;
    private User currentUser;

    public UserController() {
        this.users = new ArrayList<User>();
        this.currentUser = null;
    }

    public String registerUser(String args[]){
        String result = "";
        Matcher patata = new Matcher();
        try{
            if(args.length < 5){
                throw new Exception("Invalid number of arguments");
            }
            if(args[3].contains("*@upm.es$")){
                throw new Exception("Invalid email");
            }
        } catch (Exception e){
            result = e.getMessage();
        }
        return result;
    }
}
