package Iterator;

import Factory.*;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        String[] arrays = new String[]{"1", "2", "3"};
        ArrayCollection<String> arrayCollection = ArrayCollection.of(arrays);
        //我们创建的ArrayCollection集合类实现了迭代器后，可以使用
        for(String s : arrayCollection){
            System.out.println(s);
        }
    }

}

