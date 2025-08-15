package pckg_zd3;

import java.util.concurrent.ThreadLocalRandom;

public class NonMetricWthrServiceAdapter {


    private double tempF;
    private double wndSpdKn;

    public double getTempF(){
        return tempF;
    }
    public double getWndSpdKn(){
        return wndSpdKn;
    }
    public void readTempInf(){
        this.tempF = ThreadLocalRandom.current().nextDouble(0,114);

    }
    public void readWndSpdKn(){
        this.wndSpdKn = ThreadLocalRandom.current().nextDouble(0,60);

    }

    public void showMeasureData(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "NonMetricWthrServiceAdapter{" +
                "tempF=" + tempF +
                ", wndSpdKn=" + wndSpdKn +
                '}';
    }
}
