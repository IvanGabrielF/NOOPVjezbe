package pckg_zd3;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements WeatherObservable {

    private final List<WeatherObserver> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void addObserver(WeatherObserver obs) {
        if (!observers.contains(obs)) observers.add(obs);
    }

    @Override
    public void removeObserver(WeatherObserver obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float t, float h, float p) {
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        notifyObservers();
    }

    public List<WeatherObserver> getObservers() {
        return new ArrayList<>(observers);
    }
}
