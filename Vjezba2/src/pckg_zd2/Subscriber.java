package pckg_zd2;

public class Subscriber implements ObserverInt {

    private final String email;

    public Subscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String magazineName, String issueLbl) {
        String pdf = magazineName.replace(' ', '_') + "_" + issueLbl.replace(' ', '_') + ".pdf";
        System.out.println("Slanje izdanja u elektronskom obliku '" + pdf + "' na e-adresu: " + email);
    }
}
