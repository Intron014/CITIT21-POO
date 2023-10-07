package Wordle;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class wordle {

    char[] palabra = new char[5];
    dictionary dic = new dictionary();

    public wordle() throws FileNotFoundException {
    }

    public void random_palabra_in_dictionary(){
        int random = (int) (Math.random() * 2316);
        String palabra = dic.get_word(random);
        // System.out.println(palabra);
        for(int i=0; i<5; i++){
            this.palabra[i] = palabra.charAt(i);
        }
    }
    public char[] check_word(char[] uword){
        char[] result = new char[5];
        // Result 0-4: Letras correctas
        // Result 5-9: Letras incorrectas
        for(int i=0; i<5; i++){
            if(uword[i]==palabra[i]){
                result[i] = '+';
            }
            else{
                for(int j=0; j<5; j++){
                    if(uword[i]==palabra[j]){
                        result[i] = '*';
                    }
                    else{
                        result[i] = '-';
                    }
                }
            }
        }
        return result;
    }

}
