package Connect4.modelo;

public class Ficha {
    enum color {ROJO, AMARILLO};
    color color;
    public Ficha() {
        color = color.AMARILLO;
    }
    public void changeColor() {
        if (color == color.ROJO) {
            color = color.AMARILLO;
        } else {
            color = color.ROJO;
        }
    }
    public char getColor() {
        if(color == color.ROJO) {
            return 'X';
        } else {
            return 'O';
        }
    }
}
