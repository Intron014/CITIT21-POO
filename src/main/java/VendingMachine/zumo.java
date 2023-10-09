package VendingMachine;
import VendingMachine.sabor.SABOR;

public class zumo extends product{

    private SABOR sabor;

    public zumo(String name, int price, int quantity, String brand, String barcode, SABOR sabor) {
        super(name, price, quantity, brand, barcode);
        this.sabor = sabor;
    }
}
