package VendingMachine;

public class product {
    private String name;
    private int price;
    private int quantity;
    private String brand;
    private String barcode;

    public product(String name, int price, int quantity, String brand, String barcode) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.barcode = barcode;
    }
}
