package Strategy.example;

import Observer.Subject;
import Strategy.Sorter;
import Strategy.Strategy;

public class Main {
    public static void main(String[] args) {
        ExpressCompany shunfeng = new ShunFeng();
        ExpressService expressService = new ExpressService(shunfeng);
        System.out.println(expressService.calculatePay(10));
    }
}
