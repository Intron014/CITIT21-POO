package VendingMachine;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        vendingMachine machine = new vendingMachine();
        Scanner sc = new Scanner(System.in);
        // Main Menu
        int ans;
        do {
            System.out.println("Bienvenido a la maquina expendedora\n0 - Admin\n1 - Comprar");
            ans = sc.nextInt();
            switch (ans) {
                case 0:
                    adminInterface(machine);
                    break;
                case 1:
                    userInterface(machine);
                    break;
            }
        }while(true);
    }
    private static void adminInterface(vendingMachine machine){
        System.out.println("Welcome to inv. management");
        int cash = machine.inv.get_money();
        System.out.println("Current cash: $" + cash);

        System.out.println("1 - Add product\n2 - Delete product\n3 - List products\n4 - Add money\n5 - Remove money");
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        // String[] orders = sc.split(";");
        // String[] option = orders[1].split(",");
        // AAAA MAKES SENSE TO ME

        switch (ans){
            case 1:
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                int price = sc.nextInt();
                System.out.print("Quantity: ");
                int quantity = sc.nextInt();
                System.out.print("Brand: ");
                String brand = sc.next();
                System.out.print("Barcode: ");
                String barcode = sc.next();
                machine.inv.add_product(name, price, quantity, brand, barcode);
                break;
            case 2:
                System.out.print("Index: ");
                int index = sc.nextInt();
                machine.inv.delete_product(index);
                break;
            case 3:
                machine.inv.list_products();
                break;
            case 4:
                System.out.print("Money: ");
                int money = sc.nextInt();
                machine.inv.add_money(money);
                break;
            case 5:
                System.out.print("Money: ");
                money = sc.nextInt();
                machine.inv.remove_money(money);
                break;
        }
        sc.next();
    }
    private static void userInterface(vendingMachine machine){

    }
}
