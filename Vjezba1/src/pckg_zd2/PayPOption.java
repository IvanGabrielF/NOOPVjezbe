package pckg_zd2;

public class PayPOption implements PaymentOption{
    @Override
    public void processPayment(float amount) {
        System.out.println("Plaćeno preko paypal-a: " + amount + "$");


    }
}
