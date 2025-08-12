package pckg_zd2;

public class MonthlyMagazine extends Magazine {
    public MonthlyMagazine(String name) {
        super(name, "Mjesečno");
    }

    public void release() {
        super.releaseNewIssue();
    }
}
