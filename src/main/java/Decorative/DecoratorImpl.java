package Decorative;

public class DecoratorImpl extends Decorator{
    public DecoratorImpl(Base base) {
        super(base);
    }

    @Override
    public void test() {
        System.out.println("装饰前置");
        super.test();//直接调用父类即可
        System.out.println("装饰后置");
    }
}
