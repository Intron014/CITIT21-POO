package Wordle;
import java.io.*;
import java.util.Scanner;

public class dictionary {
    String[] words = new String[2316];
    int size = 0;


    public dictionary() throws FileNotFoundException {
        for(int i=0; i<100; i++){
            words[i] = "";
        }
        init_dictionary();

    }
    public void add_word(String word){
        if(word.length()>5||word.length()<5){
            System.out.println("La palabra debe tener 5 letras");
            return;
        }
        words[size] = word;
        size++;
    }

    public void print_dictionary(){
        for(int i=0; i<size; i++){
            System.out.println(words[i]);
        }
    }


    public int get_size(){
        return size;
    }

    public String get_word(int index){
        return words[index];
    }

    public void reset_dictionary(){
        for(int i=0; i<size; i++){
            words[i] = "";
        }
        size = 0;
    }

    public void delete_word(int index){
        for(int i=index; i<size-1; i++){
            words[i] = words[i+1];
        }
        size--;
    }

    public int check_in_dictionary(String word){
        for(int i=0; i<size; i++){
            if(word.equals(words[i])){
                return 1; // La palabra existe
            }
        }
        return 0; // La palabra no existe
    }

    public void init_dictionary() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("/home/intron014/UPM/CITIT21-POO/proyect1/src/main/java/Wordle/dictionary.txt");
        Scanner sc = new Scanner(fis);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            add_word(line);
        }
    }
}
