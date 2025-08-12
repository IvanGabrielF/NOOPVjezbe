package pckg_zd2;

public interface Observable {
    void addSub(ObserverInt subscriber);
    void removeSub(ObserverInt subscriber);
    void notifySub(String issueLbl);
}
