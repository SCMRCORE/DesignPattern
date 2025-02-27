package Factory;

public abstract class FruitFactory <T extends Fruit> {
    public abstract T getFruit();
}
