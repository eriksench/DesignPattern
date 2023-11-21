package observer;

import java.util.HashSet;

/**
 * @author zhangyuxin
 */
public class WeatherStation implements IObservable {

    private int temperature;

    private final HashSet<IObserver> observerSet;

    public WeatherStation(){
        this.temperature = 0;
        this.observerSet = new HashSet<>();
    }

    @Override
    public void add(IObserver observer) {
        this.observerSet.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observerSet.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerSet.forEach(IObserver::update);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.notifyObservers();
    }
}
