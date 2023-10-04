package I014;

import java.util.ArrayList;
import java.util.List;

public class App implements PuntoInterfaz{
    public static void main(String[] args) {
        punto punto = new punto(1, 1);
        System.out.println(punto);
        System.out.println(punto.devuelveCoordenadas());
        punto[] puntosoArray = new punto[] {punto};
        List<punto> puntosLista = new ArrayList<>();
    }

    @Override
    public String fetchCoordenadas() {
        return null;
    }
}
