package pckg_zd2;

public class QuarterlyMagazine extends Magazine {
    public QuarterlyMagazine(String name) {
        super(name, "Kvartalno");
    }

    public void release() {
        super.releaseNewIssue();
    }
}
