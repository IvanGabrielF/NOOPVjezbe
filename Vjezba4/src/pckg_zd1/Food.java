package pckg_zd1;

public class Food {
    private double price;
    private int id;
    private int cnt;
    private FoodName enumFood;

    public Food(FoodName enumFood, double price) {
        this.enumFood = enumFood;
        this.price = price;
        this.id = 1;
        this.cnt = 0;
    }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getCnt() { return cnt; }
    public void setCnt(int cnt) { this.cnt = cnt; }

    public FoodName getEnumFood() { return enumFood; }
    public void setEnumFood(FoodName enumFood) { this.enumFood = enumFood; }

    @Override
    public String toString() {
        return "Food [price=" + price + ", id=" + id + ", enumFood=" + enumFood + "]";
    }
}
