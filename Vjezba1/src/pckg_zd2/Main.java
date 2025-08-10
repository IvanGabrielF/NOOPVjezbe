package pckg_zd2;

public class Main {

    public static void main(String[] args) {

        Purchase purchase = new Purchase();

        purchase.setPaymentOption(new CardOption());
        purchase.completePayment(120.50f);

        purchase.setPaymentOption(new PayPOption());
        purchase.completePayment(75.99f);

        purchase.setPaymentOption(new CashOption());
        purchase.completePayment(50.00f);

        purchase.setPaymentOption(new CryptoOption());
        purchase.completePayment(300f);


    }
}
