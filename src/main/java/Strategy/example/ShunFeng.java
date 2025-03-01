package Strategy.example;

public class ShunFeng extends ExpressCompany{
    @Override
    public double calculate(double weight) {
        return 1+weight*5;
    }
}
