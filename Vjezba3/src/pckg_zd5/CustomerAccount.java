package pckg_zd5;

public class CustomerAccount implements CustomerAcc{

    private String customerId;
    private String shippingAddress;
    @Override
    public void assignToAcc(String customerId, String shippingAddress) {

        this.customerId= customerId;
        this.shippingAddress = shippingAddress;
        System.out.println("[Account] Assigned customer '" + customerId + "', address: " + shippingAddress);

    }

    @Override
    public boolean checkCustomerData() {
        boolean ok = customerId != null && !customerId.isEmpty() && shippingAddress != null && !shippingAddress.isEmpty();
        System.out.println("[Account] Data check: " + (ok ? "OK" : "NOT OK"));

        return ok;
    }
}
