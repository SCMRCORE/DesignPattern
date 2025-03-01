package Decorative;

public class Decorator extends Base{//装饰者负责将模板组合到类中，而装饰者实现才负责装饰具体
    protected Base base;
    public Decorator(Base base){
        this.base=base;
    }
    @Override
    public void test() {
        base.test();
    }
}
