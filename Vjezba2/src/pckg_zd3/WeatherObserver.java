package pckg_zd3;

public interface WeatherObserver {

    void update(float temp, float hum, float press);
    String getname();

}
