package pckg_zd1;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Chef {
    private String chefName;

    public Chef(String chefName) {
        this.chefName = chefName;
    }

    public void analyzeOrder() {
        System.out.println(chefName + " is analysing the order");
    }

    public void collectFoodstaff(HashMap<FoodCat, ArrayList<Food>> orders) {
        System.out.println(chefName + " -> collecting foodstuffs for:");
        for (Map.Entry<FoodCat, ArrayList<Food>> e : orders.entrySet()) {
            System.out.println(e.getKey());
            for (Food f : e.getValue()) {
                System.out.println(f + " in this order...");
            }
        }
        System.out.println();
    }

    public void preparingFood(HashMap<FoodCat, ArrayList<Food>> orders) {
        System.out.println(chefName + " -> preparing:");
        for (Map.Entry<FoodCat, ArrayList<Food>> e : orders.entrySet()) {
            System.out.println(e.getKey());
            for (Food f : e.getValue()) {
                System.out.println(f);
            }
        }
        System.out.println("All is finished and can be served to guests.");
    }
}
