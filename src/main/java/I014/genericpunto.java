package I014;


public class genericpunto {
    private double[] coordenadas;
    private COLOR color;
    public genericpunto(int dimensiones) {
        this.coordenadas = new double[dimensiones];
        this.color=COLOR.ROJO;
    }
    public void setCoordenadas(double[] coordenadas) {
        this.coordenadas = coordenadas;
    }
    public enum COLOR {
        ROJO, AZUL, AMARILLO;
    }
    public String toString() {
        String resultado = "(";
        for (int i = 0; i < coordenadas.length; i++) {
            resultado += coordenadas[i];
            if (i != coordenadas.length - 1) {
                resultado += ", ";
            }
        }
        resultado += ")";
        // StringBuilder sb = new StringBuilder();
        // sb.append("(");
        // for (int i = 0; i < coordenadas.length; i++) {
        //     sb.append(coordenadas[i]);
        //     if (i != coordenadas.length - 1) {
        //         sb.append(", ");
        //     }
        // }
        // sb.append(")");
        // resultado = sb.toString();
        return resultado;
    }
}
