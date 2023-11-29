package UPMToDo.controller;

import UPMToDo.exception.NotLoggedInException;
import UPMToDo.model.Task;
import UPMToDo.model.User;
import UPMToDo.repository.InMemoryUserRepository;
import UPMToDo.repository.UserRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class UserController {
    private final UserRepository users;
    protected User currentUser = null;

    public UserController(UserRepository users) {
        this.users = users;
    }
    public UserController(){
        users = new InMemoryUserRepository();
    }

    public String registerUser(String[] args){
        String result = "";
        try{
            if(args.length < 5){
                throw new Exception("Invalid number of arguments");
            }
            if(!Pattern.matches(".*@upm.es$", args[2])){
                throw new Exception("Invalid email");
            }
        } catch (Exception e){
            result = e.getMessage();
        }
        if(users!=null){
            users.save(new User(args[0], args[1], args[2]));
            result = "User registered";
        }
        return result;
    }
    public String showUsers(){
        final String[] result = {""};
        users.fetchAll().forEach(user -> result[0] += user.getUsername() + "\n");
        return result[0];
    }
    public String loginUser(String[] args){
        String result = "";
        try{
            if(args.length < 2){
                throw new Exception("Invalid number of arguments");
            }
        } catch (Exception e){
            result = e.getMessage();
        }
        try{
            User usernow = users.fetch(args[0], args[1]);
            if(usernow == null){
                throw new Exception("User not found");
            }
            currentUser = usernow;
        } catch (Exception e){
            result = e.getMessage();
        }
        result = "User " + currentUser.getUsername() + " logged in";
        return result;
    }

    public String logoutUser(){
        String result = "";
        try{
            isLoggedIn();
        } catch (Exception e){
            result = e.getMessage();
        }
        result = "User " + currentUser.getUsername() + " logged out, BYE BYE D:";
        currentUser = null;
        return result;
    }

    public String addTask(String[] args){
        String result = "";
        try{
            if(args.length < 1){
                throw new Exception("Invalid number of arguments");
            }isLoggedIn();
        } catch (Exception e){
            result = e.getMessage();
        }
        Task tasker = new Task(args[0], LocalDate.parse(args[1]));
        currentUser.addTask(tasker);
        return result;
    }
    public String showTasks(){
        String result = "";
        try{
            isLoggedIn();
        } catch (Exception e){
            result = e.getMessage();
        }
        List<Task> tasks = currentUser.getTasks();
        for(Task task : tasks){
            result += task.getTaskName() + " " + task.getDoneDate() + "\n";
        }
        return result;
    }
    public String removeTask(String[] args) {
        String result = "";
        try {
            if (args.length < 2) {
                throw new Exception("Invalid number of arguments");
            }
            isLoggedIn();
        } catch (Exception e) {
            result = e.getMessage();
        }
        List<Task> tasks = currentUser.getTasks();
        Task deltask = null;
        for (Task task : tasks) {
            if (task.getTaskName().equals(args[1])) {
                deltask = task;
                break;
            }
        }
        currentUser.removeTask(deltask);
        return result;
    }
    public String editTask(String[] args){
        String result = "";
        try{
            if(args.length < 4){
                throw new Exception("Invalid number of arguments");
            }
            isLoggedIn();
        } catch (Exception e){
            result = e.getMessage();
        }
        List<Task> tasks = currentUser.getTasks();
        for(Task task : tasks){
            if(task.getTaskName().equals(args[1])){
                task.setTaskName(args[2]);
                task.setDoneDate(LocalDate.parse(args[3]));
                break;
            }
        }
        return result;
    }

    private void isLoggedIn() throws NotLoggedInException{
        if(currentUser == null){
            throw new NotLoggedInException();
        }
    }
}
