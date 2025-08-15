package pckg_zd3;

public class Adapter implements PrimaryInterface{

    private NonMetricWthrServiceAdapter wthrServiceAdapter;
    private double temp;
    private double spd;


    public Adapter(NonMetricWthrServiceAdapter adaptee){
        this.wthrServiceAdapter = adaptee;
    }
    @Override
    public void readTempC() {
        wthrServiceAdapter.readTempInf();
        this.temp = convertFToC(wthrServiceAdapter.getTempF());

    }

    @Override
    public void readWndSpdms() {
        wthrServiceAdapter.readWndSpdKn();
        this.spd = convertKnToMs(wthrServiceAdapter.getWndSpdKn());


    }

    @Override
    public void readHum() {
        System.out.println("Not available!");

    }

    @Override
    public void showWthrData() {
        System.out.println();
        System.out.println("******************* Weather data *********************");
        System.out.println("Raw input from " + wthrServiceAdapter.getClass().getSimpleName() + ":");
        wthrServiceAdapter.showMeasureData();
        System.out.println("Converted (adapter):");
        System.out.println(this);

    }
    private double convertFToC(double f){
        return (f - 32) * 0.5556;
    }
    private double convertKnToMs(double kn) {
        return kn / 1.9438;
    }

    @Override
    public String toString() {
        return "Adapter{" +
                "wthrServiceAdapter=" + wthrServiceAdapter +
                ", temp=" + temp +
                ", spd=" + spd +
                '}';
    }
}
