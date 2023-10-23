package Connect4.modelo;

import java.util.Scanner;

public class Game {
    private Tablero tablero;
    private Ficha turno;
    private static final int MINCOLUMN = 0;
    private static final int MAXCOLUMN = 7;

    public Game() {
        tablero = new Tablero();
        turno = new Ficha();
    }

    public void changeTurn() {
        turno.changeColor();
    }
    private boolean checkHorizontal(int i, int j) {
        boolean win = false;
        if (j < 5) {
            if (tablero.tablero[i][j] == tablero.tablero[i][j + 1] && tablero.tablero[i][j] == tablero.tablero[i][j + 2]
                    && tablero.tablero[i][j] == tablero.tablero[i][j + 3]) {
                win = true;
            }
        }
        return win;
    }
    private boolean checkVertical(int i, int j) {
        boolean win = false;
        if (i < 5) {
            if (tablero.tablero[i][j] == tablero.tablero[i + 1][j] && tablero.tablero[i][j] == tablero.tablero[i + 2][j]
                    && tablero.tablero[i][j] == tablero.tablero[i + 3][j]) {
                win = true;
            }
        }
        return win;
    }
    private boolean checkDiagonal(int i, int j){
        boolean win = false;
        if (i < 5 && j < 5) {
            if (tablero.tablero[i][j] == tablero.tablero[i + 1][j + 1] && tablero.tablero[i][j] == tablero.tablero[i + 2][j + 2]
                    && tablero.tablero[i][j] == tablero.tablero[i + 3][j + 3]) {
                win = true;
            }
        }
        if (i < 5 && j > 2) {
            if (tablero.tablero[i][j] == tablero.tablero[i + 1][j - 1] && tablero.tablero[i][j] == tablero.tablero[i + 2][j - 2]
                    && tablero.tablero[i][j] == tablero.tablero[i + 3][j - 3]) {
                win = true;
            }
        }
        return win;
    }
    public int checkWin(){
        int win = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j< 8; j++) {
                if (tablero.tablero[i][j] == turno.getColor()) {
                    if (checkHorizontal(i, j) || checkVertical(i, j) || checkDiagonal(i, j)) {
                        win = 1;
                    }
                }
            }
        }
        return win;
    }

    public void dropFicha(int columna) throws Exception {
        boolean arrived = false;
        if(columna < 0 || columna > 7)
            System.out.println("Columna no válida");
        else {
            for (int i = 0; i < 8 && !arrived; i++) {
                if (tablero.tablero[i][columna] == ' ') {
                    tablero.tablero[i][columna] = turno.getColor();
                    arrived = true;
                }
            }
            if (!arrived)
                System.out.println("Columna llena, try again");
            else
                changeTurn();
        }
    }

    public static void main(String[] args) throws Exception {
        Game game = new Game();
        Scanner sc = new Scanner(System.in);
        do {
            game.tablero.printTablero();
            System.out.println("Turno de " + game.turno.getColor());
            System.out.println("Introduce la columna donde quieres tirar la ficha");
            int columna = sc.nextInt();
            game.dropFicha(columna);
        } while(game.checkWin() == 0);
    }
}
