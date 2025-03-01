package Strategy;

import Builder.Student;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        sorter.setStrategy(Strategy.SINGLE);
        sorter.sort(new int[]{4, 1, 3, 2});
    }
}
