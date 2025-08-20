package pckg_zd2;

public class CheckingAccount extends Account{
    private static final long serialVersionUID = 1;

    private float amount;


    public CheckingAccount(int id, String name, float initialBalance) {
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
        return "CheckingAccount{" +
                "amount=" + amount +
                '}';
    }
}
