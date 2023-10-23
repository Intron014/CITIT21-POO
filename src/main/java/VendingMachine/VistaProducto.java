package VendingMachine;

public class VistaProducto {
    public String mostrarProducto(product producto){
        StringBuilder stringRepresentation = new StringBuilder();
        stringRepresentation.append("Añadido producto:");
        stringRepresentation.append(producto.getName());
        return stringRepresentation.toString();
    }
}
