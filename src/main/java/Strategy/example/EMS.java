package Strategy.example;

public class EMS extends ExpressCompany{
    @Override
    public double calculate(double weight) {
        return 2+weight*10;
    }
}
