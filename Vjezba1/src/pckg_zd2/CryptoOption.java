package pckg_zd2;

public class CryptoOption implements PaymentOption{
    @Override
    public void processPayment(float amount) {


        double rate = 50000.0;
        double btcoinAmount = amount/rate;

        System.out.println("Plaćananje bitcoinom: " + amount + "$ " + "==> " + btcoinAmount + "BTC");



    }
}
