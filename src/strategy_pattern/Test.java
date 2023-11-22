package strategy_pattern;

/**
 * 定义了算法族，分别封装起来，让他们之间可以相互替换；
 * 让算法的变化独立于使用算法的客户。
 */
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
