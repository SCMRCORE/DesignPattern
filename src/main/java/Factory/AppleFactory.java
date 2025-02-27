package Factory;

public class AppleFactory extends FruitFactory<Apple> {
    @Override
    public Apple getFruit() {
        return new Apple();
    }
}
