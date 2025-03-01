package Strategy;

import java.util.Arrays;

public interface Strategy {
    Strategy SINGLE = Arrays::sort;
    Strategy PARALLEL = Arrays::parallelSort;

    void sort(int[] arrays);
}
