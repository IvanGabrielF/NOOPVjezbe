package pckg_zd1;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class OnlineStore implements ObservableInt{

    private String storeName;
    private int storeId;
    private ArrayList<Customer> customers;
    private Item availableItem;


    public OnlineStore(String name){
        this.storeName = name;
        this.storeId = ThreadLocalRandom.current().nextInt(100000);
        this.customers = new ArrayList<>();
    }


    public void setItemAvail(Item item){
        this.availableItem = item;
    }
    @Override
    public void add2AvailLst(Customer cst) {
        if (!customers.contains(cst)){
            customers.add(cst);
        }

    }

    @Override
    public void remove4AvailLst(Customer cst) {
        if (!customers.contains(cst)) {
            System.out.println("Kupac nije pretplaćen.");
        }else {
            customers.remove(cst);
        }

    }

    @Override
    public void notifyCsts() {
        for (Customer c : customers){
            c.update(availableItem,storeName);
        }

    }
}
