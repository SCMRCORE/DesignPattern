package Decorative;

import Combination.Directory;
import Combination.File;

public class Main {
    public static void main(String[] args) {
        Base base = new BaseImpl();
        Decorator decorator = new DecoratorImpl(base);
        Decorator outer = new DecoratorImpl(decorator);//装饰者还可以嵌套
        decorator.test();
        outer.test();

    }
}
