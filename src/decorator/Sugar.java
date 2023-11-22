package decorator;

/**
 * @author zhangyuxin
 */
public class Sugar extends AddOnDecorator {
    private final int PRICE = 1;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Integer getCost() {
        return this.beverage.getCost() + this.PRICE;
    }
}
