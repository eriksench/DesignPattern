package decorator;

/**
 * @author zhangyuxin
 */
public class Chocolate extends AddOnDecorator {
    private final int PRICE = 2;

    public Chocolate(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public Integer getCost() {
        return this.beverage.getCost() + this.PRICE;
    }
}
