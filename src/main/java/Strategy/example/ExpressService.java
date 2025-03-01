package Strategy.example;

public class ExpressService {

    private ExpressCompany expressCompany;

    public ExpressService(ExpressCompany expressCompany){
        this.expressCompany=expressCompany;
    }

    public double calculatePay(double weight){
        return expressCompany.calculate(weight);
    }
}
