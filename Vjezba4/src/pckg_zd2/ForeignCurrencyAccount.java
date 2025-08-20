package pckg_zd2;

public class ForeignCurrencyAccount extends Account{

    private float amount;
    public ForeignCurrencyAccount(int id, String name, float initialBalance) {
        super(id, name, initialBalance);
    }

    @Override
    public void setAmount(float amount) {
        this.amount = amount;

    }

    @Override
    public float getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "ForeignCurrencyAccount{" +
                "amount=" + amount +
                '}';
    }
}
