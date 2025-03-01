package Strategy;

public class Sorter {

    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy=strategy;
    }

    public void sort(int[] arrays){
        strategy.sort(arrays);
    }

}
