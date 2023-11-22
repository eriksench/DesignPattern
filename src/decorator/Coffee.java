package decorator;

/**
 * @author zhangyuxin
 */
public class Coffee extends Beverage{

    private final int PRICE = 3;

    @Override
    public Integer getCost() {
        return this.PRICE;
    }
}
