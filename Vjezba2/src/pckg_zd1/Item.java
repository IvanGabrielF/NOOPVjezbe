package pckg_zd1;

public class Item {
    private String itemName;
    private String itemCat;

    public Item(String name, String category){
        this.itemCat = category;
        this.itemName = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemCat='" + itemCat + '\'' +
                '}';
    }
}
