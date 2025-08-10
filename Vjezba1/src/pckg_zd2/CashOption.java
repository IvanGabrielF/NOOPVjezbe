package pckg_zd2;

public class CashOption implements PaymentOption{
    @Override
    public void processPayment(float amount) {
        System.out.println("Plaćanje pouzećem: " + amount + "$");

    }
}
