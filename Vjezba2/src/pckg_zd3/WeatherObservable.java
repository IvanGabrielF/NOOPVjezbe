package pckg_zd3;

public interface WeatherObservable {

    void  addObserver(WeatherObserver obs);
    void removeObserver(WeatherObserver obs);

    void notifyObservers();


}
