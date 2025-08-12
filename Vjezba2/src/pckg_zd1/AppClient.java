package pckg_zd1;

public class AppClient {

    public static void main(String[] args) {
        OnlineStore store = new OnlineStore("Pevex Web Shop");

        Customer customer1 = new Customer("Ante");
        Customer customer2 = new Customer("Marko");

        store.setItemAvail(new Item("Bosch brusilica", "tools"));
        store.add2AvailLst(customer1);
        store.add2AvailLst(customer2);

        store.notifyCsts();

    }
}
