package strategy_pattern;

public class FlyWithJet implements IFlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly with jet");
    }
}
