package pckg_zd2;

public class Client {
    public static void main(String[] args) {


        Account chk = new CheckingAccount(100, "Sandra", 125.0f);
        Account fxa = new ForeignCurrencyAccount(200, "Vito", 100.0f);



        MobAppInv app = new MobAppInv();


        PaymentServiceInt depFX = new DepositMoney(fxa, 250.5f);
        app.performTransaction(depFX);
        app.undoLastTransaction();
        app.redo();

        PaymentServiceInt depCHK = new DepositMoney(chk, 500f);
        app.performTransaction(depCHK);
    }
}
