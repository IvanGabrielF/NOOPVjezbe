package pckg_zd2;

public class Purchase {

    private PaymentOption paymentOption;

    public void setPaymentOption(PaymentOption option){
        this.paymentOption=option;
    }

    public void completePayment(float amount){
        if (paymentOption == null){
            System.out.println("Niste odabrali način plaćanja!");
            return;
        }
        paymentOption.processPayment(amount);
    }
}
