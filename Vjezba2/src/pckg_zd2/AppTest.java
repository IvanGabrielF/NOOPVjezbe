package pckg_zd2;

public class AppTest {
    public static void main(String[] args) {
        MonthlyMagazine monthlyMagazine = new MonthlyMagazine("Python programiranje");
        QuarterlyMagazine quarterlyMagazine = new QuarterlyMagazine("Java Programiranje");

        Subscriber subscriber1 = new Subscriber("fsdf@fg");
        Subscriber subscriber2 = new Subscriber("fsdas@efasf");
        Subscriber subscriber3 = new Subscriber("dsfdfs@sdfqefqe");





        monthlyMagazine.addSub(subscriber1);
        monthlyMagazine.addSub(subscriber2);

        quarterlyMagazine.addSub(subscriber2);
        quarterlyMagazine.addSub(subscriber3);

        monthlyMagazine.release();
        quarterlyMagazine.release();

        quarterlyMagazine.removeSub(subscriber2);

        monthlyMagazine.release();
        quarterlyMagazine.release();


    }
}
