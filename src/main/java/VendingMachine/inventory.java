package VendingMachine;

public class inventory {
    private product[] products = new product[50];
    private int money;
    private int num_products = 0;

    public inventory(){
        this.money = 0;
    }

    public void add_product(String name, int price, int quantity, String brand, String barcode){
        if(this.num_products == 50){
            System.out.println("No se pueden agregar mas productos");
            return;
        }
        this.products[this.num_products] = new product(name, price, quantity, brand, barcode);
        this.num_products++;
    } // Producto sin azucar

    public void add_product(String name, int price, int quantity, String brand, String barcode, int cantidadAzucar, double sugarTax){
        this.products[this.num_products] = new sugarProducts(name, price, quantity, brand, cantidadAzucar, barcode, sugarTax);
        this.num_products++;
    } // Producto azucarado
    public void list_products(){
        for (int i = 0; i < this.num_products; i++) {
            System.out.println(i + " - " + this.products[i].getName());
        }
    }
    public void delete_product(int index){
        this.products[index] = null;
        for (int i = index; i < this.num_products; i++) {
            this.products[i] = this.products[i+1];
        }
        this.num_products--;
    }
    public void add_money(int money){
        this.money += money;
    }
    public void remove_money(int money){
        this.money -= money;
    }
    public int get_money(){
        return this.money;
    }
}
