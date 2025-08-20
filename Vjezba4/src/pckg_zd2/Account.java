package pckg_zd2;

import java.io.Serializable;

public abstract class Account implements Serializable {

    private static final long serialVersionUID = 1;

    protected int id;
    protected String name;
    protected float accountBalance;


    public Account(int id, String name, float initialBalance) {
        this.id = id;
        this.name = name;
        this.accountBalance = initialBalance;
    }

    public int getAccID() {
        return id;
    }
    public String getUserName() {
        return name;
    }
    public float getAccountBalance() {
        return accountBalance;
    }

    public void setBalance(float amount) {
        this.accountBalance = amount;
    }

    public abstract void setAmount(float amount);
    public abstract float getAmount();


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
