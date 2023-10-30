package pet_store.modelo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class App {
    private static final Scanner sc = new Scanner(System.in);
    private static final String ORDER_NEW_MASCOTA = "newMascota";
    public static void main(String[] args) throws LeException {
        PetController petController = new PetController();
        String cmd = "";
        while(cmd!=null){
            Map<String, String[]> command = processCommand();
            if(command.containsKey(ORDER_NEW_MASCOTA)){
                petController.createPet(command.get(ORDER_NEW_MASCOTA));
            }
        }
    }
    private static final String COMMAND_TOKEN = ";";
    private static final String ARGUMENT_TOKEN = ";";
    private static final Integer COMMAND_POS = 0;
    private static final Integer ARGUMENT_POS = 1;
    public static Map<String, String[]> processCommand(){
        Map<String, String[]> command = new HashMap<>();
        String rawCommand = sc.next();
        String[] splittedCommand = rawCommand.split(COMMAND_TOKEN);
        String order = splittedCommand[COMMAND_POS];
        String[] arguments = splittedCommand[ARGUMENT_POS].split(ARGUMENT_TOKEN);
        return command;
    }
}
