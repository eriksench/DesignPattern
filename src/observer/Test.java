package observer;

/**
 * @author zhangyuxin
 */
public class Test {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        IObserver phone = new PhoneDisplay(weatherStation);
        IObserver window = new WindowDisplay(weatherStation);

        weatherStation.add(phone);
        weatherStation.add(window);

        for (int i = 0; i < 5; i++) {
            weatherStation.setTemperature(i);
        }
    }
}
