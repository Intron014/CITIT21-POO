package VendingMachine;
import VendingMachine.sabor.SABOR;

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
    }

    public void add_product(String name, int price, int quantity, String brand, String barcode, SABOR sabor){
        this.products[this.num_products] = new zumo(name, price, quantity, brand, barcode, sabor);
        this.num_products++;
    }
    public void add_product(String name, int price, int quantity, String brand, String barcode, int cantidadAzucar, double sugarTax){
        this.products[this.num_products] = new sugarProducts(name, price, quantity, brand, cantidadAzucar, barcode, sugarTax);
        this.num_products++;
    }

}
