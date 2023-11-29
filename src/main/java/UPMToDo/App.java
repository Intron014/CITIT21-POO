package UPMToDo;
import UPMToDo.controller.UserController;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Boolean isNotLeaving = true;
        Scanner scanner = new Scanner(System.in);
        while(isNotLeaving){
            String input = scanner.nextLine();
            String[] parts = input.split(" ", 2);
            String command = parts[0];
            String[] argums = parts.length > 1 ? parts[1].split(" ") : new String[0];
            switch(command){
                case "register":
                    System.out.println(userController.registerUser(argums));
                    break;
                case "login":
                    System.out.println(userController.loginUser(argums));
                    break;
                case "logout":
                    userController.logoutUser();
                    break;
                case "exit":
                    isNotLeaving = false;
                    break;
                case "showusers":
                    System.out.println(userController.showUsers());
                    break;
                case "addtask":
                    System.out.println(userController.addTask(argums));
                    break;
                case "showtasks":
                    System.out.println(userController.showTasks());
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
        scanner.close();
    }
}