package pckg_zd1;

public class FoodCat {
    private int id;
    private int cnt;
    private EnumFoodCat enumFoodCat;

    public FoodCat(EnumFoodCat enumFoodCat) {
        this.enumFoodCat = enumFoodCat;
        this.id = 1;
        this.cnt = 0;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getCnt() { return cnt; }
    public void setCnt(int cnt) { this.cnt = cnt; }

    public EnumFoodCat getEnumFoodCat() { return enumFoodCat; }
    public void setEnumFoodCat(EnumFoodCat enumFoodCat) { this.enumFoodCat = enumFoodCat; }

    @Override
    public String toString() {
        return "FoodCat [id=" + id + ", enumFoodCat=" + enumFoodCat + "]";
    }
}
