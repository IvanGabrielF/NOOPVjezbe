package pckg_zd1;

public class WaiterInvok {
    private String waitName;

    public WaiterInvok(String waitName) {
        this.waitName = waitName;
    }

    public void setOrderCmd(IntCmd cmd) {
        System.out.println(waitName + " sets an order.");
        cmd.executeOrder();
    }

    public void setUpOrder(IntCmd cmd) {
        System.out.println(waitName + " sets up an order.");
        cmd.executeOrder();
    }

    public void withdrawOrder(IntCmd cmd) {
        System.out.println(waitName + " withdraws an order.");
        cmd.undoOrder();
    }
}
