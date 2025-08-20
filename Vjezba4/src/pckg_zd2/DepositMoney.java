package pckg_zd2;

public class DepositMoney implements PaymentServiceInt{

    private Account account;
    private float oldbalance;
    private float amount;


    public DepositMoney(Account account, float amount){
        this.account=account;
        this.oldbalance = account.getAccountBalance();
        this.amount = amount;
    }
    @Override
    public void execute() {
        account.setBalance(account.getAccountBalance() + amount);
        System.out.println(">> Deposit executed");
        System.out.println(this);


    }

    @Override
    public void undo() {

        account.setBalance(oldbalance);
        System.out.println("<< Undo last transaction");
        System.out.println(this);
    }

    @Override
    public void redo() {
        execute();
        System.out.println("<Redo last transaction");

    }

    @Override
    public String toString() {
        return "DepositMoney{" +
                "account=" + account +
                ", oldbalance=" + oldbalance +
                ", amount=" + amount +
                '}';
    }
}
