package Connect4.modelo;

public class Tablero {
    char[][] tablero = new char[8][8];

    public Tablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j< 8; j++) {
                tablero[i][j] = ' ';
            }
        }
    }
    public void printInverseTablero(){
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j< 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printTablero(){
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 7; i >= 0; i--) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j< 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

}
