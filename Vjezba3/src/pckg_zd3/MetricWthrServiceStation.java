package pckg_zd3;

import java.util.concurrent.ThreadLocalRandom;

public class MetricWthrServiceStation implements PrimaryInterface{

    private double temp;

    private double wndSpeed;
    private double humidity;

    @Override
    public void readTempC() {
        this.temp = ThreadLocalRandom.current().nextDouble(-12,40);


    }

    @Override
    public void readWndSpdms() {
        this.wndSpeed = ThreadLocalRandom.current().nextDouble(0,35);


    }

    @Override
    public void readHum() {
        this.humidity = ThreadLocalRandom.current().nextDouble(0,100);

    }

    @Override
    public void showWthrData() {
        System.out.println("**** Weather data***");
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "MetricWthrServiceStation{" +
                "temp=" + temp +
                ", wndSpeed=" + wndSpeed +
                ", humidity=" + humidity +
                '}';
    }
}
