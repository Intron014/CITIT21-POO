package Wordle;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        try {
            char[] uword = new char[5];
            boolean win = false;
            int wincnt;
            wordle w = new wordle();
            w.random_palabra_in_dictionary();
            System.out.println("Bienvenido a Wordle\n+: Letra correcta\n*: Letra en palabra\n-: Letra incorrecta\n");

            for(int cnt=0; cnt<6 && !win; cnt++) {
                String word;
                Boolean exists = true;
                do {
                    Scanner sc = new Scanner(System.in);
                    word = sc.nextLine();
                    if(word.length() != 5){
                        System.out.println("La palabra debe tener 5 letras");
                    }
                    else if(w.dic.check_in_dictionary(word)==0){
                        System.out.println("La palabra no existe");
                        exists = false;
                    } else{
                        exists = true;
                    }
                } while (word.length() != 5 || !exists);
                for (int i = 0; i < 5; i++) {
                    uword[i] = word.charAt(i);
                }
                char[] result = w.check_word(uword);
                for (int i = 0; i < 5; i++) {
                    System.out.print(" " + uword[i] + " ");
                }
                System.out.println();
                wincnt = 0;
                for (int i = 0; i < 5; i++) {
                    System.out.print(" " + result[i] + " ");
                    if(result[i]=='+'){
                        wincnt++;
                    }
                }
                if(wincnt==5){
                    win = true;
                    System.out.println("\nHas ganado!");
                }
                System.out.println();
            }
            if(!win)
                System.out.println("\nLa palabra era: " + w.palabra[0] + w.palabra[1] + w.palabra[2] + w.palabra[3] + w.palabra[4]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }}
