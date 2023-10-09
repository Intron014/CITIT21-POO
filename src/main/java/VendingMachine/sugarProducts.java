package VendingMachine;

public class sugarProducts extends product{
    private int cantidadAzucar;
    private final double sugarTax = 0.2;

    public sugarProducts(String name, int price, int quantity, String brand, int cantidadAzucar, String barcode, double sugarTax) {
        super(name, price, quantity, brand, barcode);
        this.cantidadAzucar = cantidadAzucar;
    }

    public sugarProducts(String name, int price, int quantity, String brand, String barcode, int cantidadAzucar) {
        super(name, price, quantity, brand, barcode);
        this.cantidadAzucar = cantidadAzucar;
    }
}
