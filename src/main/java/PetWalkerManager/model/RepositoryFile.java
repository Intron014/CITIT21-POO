package PetWalkerManager.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class RepositoryFile <T> {
    private String fileName;
    public RepositoryFile(String persistence){
        fileName = persistence;
    }
    public void save (T object) throws FileNotFoundException {
        try{
            String data = object.toString();
            File file = new File(fileName);
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file, true);
            writer.write(data);
            writer.close();
        } catch (FileNotFoundException e){
            throw new FileNotFoundException("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public List<T> fetch(){
        return null;
    }
}
