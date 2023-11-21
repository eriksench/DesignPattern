package observer;

/**
 * @author zhangyuxin
 */
public class WindowDisplay implements IObserver{

    private final WeatherStation weatherStation;

    public WindowDisplay(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }
    @Override
    public void update() {
        System.out.println("window:" + this.weatherStation.getTemperature());
    }
}
