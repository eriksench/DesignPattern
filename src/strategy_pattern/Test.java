package strategy_pattern;

public class Test {
    public static void main(String[] args) {
        Duck yellowDuck = new YellowDuck(new FlyWithWings(), new SimpleQuack());
        yellowDuck.fly();
        yellowDuck.quack();

        Duck toyDuck = new PlasticDuck(new FlyWithJet(), new MuteQuack());
        toyDuck.fly();
        toyDuck.quack();
    }
}
