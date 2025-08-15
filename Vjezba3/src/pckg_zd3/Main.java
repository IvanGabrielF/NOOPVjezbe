package pckg_zd3;

public class Main {

    private static PrimaryInterface objMes;
    public static void main(String[] args) {

        objMes = new MetricWthrServiceStation();
        objMes.readTempC();
        objMes.readWndSpdms();
        objMes.readHum();
        objMes.showWthrData();


        objMes = new Adapter(new NonMetricWthrServiceAdapter());
        objMes.readTempC();
        objMes.readWndSpdms();
        objMes.readHum();
        objMes.showWthrData();


    }
}
