package Factory;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Apple apple = new AppleFactory().getFruit();
        System.out.println(apple);

        Orange orange = new OrangeFactory().getFruit();
        System.out.println(orange);

        test(new AppleFactory()::getFruit);
    }

    public static void test(Supplier<Fruit> supplier){
        System.out.println(supplier.get()+"被吃掉了真好吃");
    }
}

