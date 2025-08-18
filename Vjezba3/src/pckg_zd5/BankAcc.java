package pckg_zd5;

public class BankAcc {

    private String iban;
    private String owner;

    public BankAcc(String iban, String owner){
        this.iban= iban;
        this.owner = owner;

    }

    @Override
    public String toString() {
        return "BankAcc{" +
                "iban='" + iban + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
