package Factory;

public class OrangeFactory extends FruitFactory<Orange> {
    @Override
    public Orange getFruit() {
        return new Orange();
    }
}
