package pckg_zd2;

public class CardOption implements PaymentOption{
    @Override
    public void processPayment(float amount) {
        System.out.println("Plaćanje je izvršeno karticom: " + amount + " $");

    }
}
