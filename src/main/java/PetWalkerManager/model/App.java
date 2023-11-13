package PetWalkerManager.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    private static final Scanner sc = new Scanner(System.in);
    private static final String CMD_SEP = ";";
    private static final Integer CMD_POS = 0;
    private static final String ARG_SEP = ";";
    private static final Integer ARG_POS = 1;

    public static void main(String[] args){
        String cmd = null;
        do {
            Map<String, String[]> command = processCommand();
            if(command.containsKey("login")){
                String[] argum = command.get("login");
            } else if(command.containsKey("register")){
                String[] argum = command.get("register");
            } else if()
        } while (cmd!=null);
    }

    private static Map<String, String[]> processCommand(){
        Map<String, String[]> command = new HashMap<>();
        String rawcmd = sc.next();
        System.out.println("RAW: " + rawcmd);
        String[] splittedCommand = rawcmd.split(CMD_SEP);
        String order = splittedCommand[CMD_POS];
        String[] arguments = splittedCommand[ARG_POS].split(ARG_SEP);
        command.put(order, arguments);
        return command;

    }

}
