package strategy_pattern;

public class MuteQuack implements IQuackBehavior{
    @Override
    public void quack() {
        System.out.println("...");
    }
}
