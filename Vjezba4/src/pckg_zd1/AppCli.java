package pckg_zd1;

import java.util.ArrayList;
import java.util.HashMap;

public class AppCli {

    public static void main(String[] args) {
        // receiver
        Chef chef = new Chef("Paško");

        HashMap<FoodCat, ArrayList<Food>> orders = new HashMap<>();

        FoodCat fish = new FoodCat(EnumFoodCat.Fish);
        ArrayList<Food> fishList = new ArrayList<>();
        fishList.add(new Food(FoodName.food33, 55.43));
        fishList.add(new Food(FoodName.food11, 22.45));
        orders.put(fish, fishList);

        FoodCat dessert = new FoodCat(EnumFoodCat.Dessert);
        ArrayList<Food> dessertList = new ArrayList<>();
        dessertList.add(new Food(FoodName.food5, 11.21));
        orders.put(dessert, dessertList);

        // command objekt
        OrderCmd orderCmd = new OrderCmd(chef, 1, orders, 10);

        // invoker
        WaiterInvok waiter = new WaiterInvok("Marko");

        waiter.setOrderCmd(orderCmd);

        waiter.withdrawOrder(orderCmd);
    }
}
