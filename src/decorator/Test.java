package decorator;

/**
 * @author zhangyuxin
 * <p>
 * 装饰者模式动态地将责任附加到对象上，若要扩展功能，装饰者提供了比继承更有弹性的替代方案
 */
public class Test {


    public static void main(String[] args) {
        Beverage beverage = new Chocolate(new Sugar(new Coffee()));
        System.out.println(beverage.getCost());
    }
}
