package VendingMachine;

public class inventory {
    product[] products = new product[50];
    int money;
    private int num_products = 0;

    public inventory(){
        this.money = 0;
    }

    public void add_product(String name, int price, int quantity, String brand, String barcode){
        this.products[this.num_products] = new product(name, price, quantity, brand, barcode);
        this.num_products++;
    } // Producto sin azucar

    public void add_product(String name, int price, int quantity, String brand, String barcode, int cantidadAzucar, double sugarTax){
        this.products[this.num_products] = new sugarProducts(name, price, quantity, brand, cantidadAzucar, barcode, sugarTax);
        this.num_products++;
    } // Producto azucarado

}
