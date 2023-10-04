package Wordle;

public class tablero {
    char[][] tablero = new char[6][5];

    public tablero(){
        for(int i=0; i<6; i++){
            for(int j=0; j<5; j++){
                tablero[i][j] = ' ';
            }
        }
    }

    public void vaciar_tablero(){
        for(int i=0; i<6; i++){
            for(int j=0; j<5; j++){
                tablero[i][j] = ' ';
            }
        }
    }

    public void imprimir_tablero(){
        for(int i=0; i<6; i++){
            for(int j=0; j<5; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }




}
