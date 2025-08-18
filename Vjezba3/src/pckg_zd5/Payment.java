package pckg_zd5;

public interface Payment {

    boolean assignToPaymentAcc(BankAcc bankAcc);
    void linkToCustomerBankAcc();

    void performTransaction();


}
