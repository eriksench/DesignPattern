package strategy_pattern;

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}
