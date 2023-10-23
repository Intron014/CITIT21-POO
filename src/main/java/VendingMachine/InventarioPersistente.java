package VendingMachine;

public class InventarioPersistente {
    public static inventory crearInventarioPersistente(){
        inventory inv = new inventory();

        inv.add_product("Coca Cola", 1000, 10, "Coca Cola Company", "123456789");
        inv.add_product("Pepsi", 1000, 10, "Pepsi Company", "987654321");
        inv.add_product("Sprite", 1000, 10, "Coca Cola Company", "123456789");
        inv.add_product("Fanta", 1000, 10, "Coca Cola Company", "123456789", 10, 0.2);
        inv.add_product("7up", 1000, 10, "Pepsi Company", "987654321", 10, 0.2);
        inv.add_product("Pepsi Light", 1000, 10, "Pepsi Company", "987654321", 10, 0.2);
        inv.add_money(10000000);
        return inv;
    }
}
