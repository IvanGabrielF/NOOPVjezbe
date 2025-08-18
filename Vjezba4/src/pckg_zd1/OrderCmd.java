package pckg_zd1;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderCmd implements IntCmd {
    private Chef chef;
    private int cnt;
    private HashMap<FoodCat, ArrayList<Food>> orders;
    private int tableNumber;

    public OrderCmd(Chef chef, int cnt, HashMap<FoodCat, ArrayList<Food>> orders, int tableNumber) {
        this.chef = chef;
        this.cnt = cnt;
        this.orders = orders;
        this.tableNumber = tableNumber;
    }

    @Override
    public void executeOrder() {
        System.out.println("<< [Table: " + tableNumber + "] >>>>");
        chef.analyzeOrder();
        chef.collectFoodstaff(orders);
        chef.preparingFood(orders);
        System.out.println("****************************************\n");
    }

    @Override
    public void undoOrder() {
        System.out.println("Order for table " + tableNumber + " has been cancelled.");
    }
}
