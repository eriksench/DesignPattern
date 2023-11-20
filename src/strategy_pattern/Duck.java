package strategy_pattern;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public abstract void fly();

    public abstract void quack();

}
