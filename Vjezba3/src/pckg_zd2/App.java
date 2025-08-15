package pckg_zd2;

public class App {

    public static void main(String[] args) {
        Ispis novi = new NoviPloter();
        novi.ispisGrafike();


        System.out.println("++++++++++++++");

        Ispis stari = new PloterAdapter(new StariPloter());
        stari.ispisGrafike();


    }
}
