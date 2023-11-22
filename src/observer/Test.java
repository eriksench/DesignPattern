package observer;

/**
 * @author zhangyuxin
 *
 * 观察者模式：定义对象之间的一对多依赖，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新
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
