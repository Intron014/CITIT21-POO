package VendingMachine;

public class vendingMachine {
    public inventory inv;

    public vendingMachine() {
        this.inv = InventarioPersistente.crearInventarioPersistente();
    }

}
