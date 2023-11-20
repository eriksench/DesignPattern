package strategy_pattern;

public class PlasticDuck extends Duck{

    public PlasticDuck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void fly() {
        this.flyBehavior.fly();
    }

    @Override
    public void quack() {
        this.quackBehavior.quack();
    }
}
