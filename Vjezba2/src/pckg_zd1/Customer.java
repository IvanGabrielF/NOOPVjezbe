package pckg_zd1;

public class Customer implements CustObserverInt{

    private static int counter = 1;
    private int id;
    private String userName;

    public Customer(String name){
        this.id= counter++;
        this.userName = name;
    }
    @Override
    public void update(Item item, String storeName) {
        System.out.println("*** Obavijest za kupca " + id + ": " + userName);
        System.out.println("Trgovina:" + storeName);
        System.out.println("Proizvod " + item + " je dostupan.");
        System.out.println("*******************************\n");

    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
