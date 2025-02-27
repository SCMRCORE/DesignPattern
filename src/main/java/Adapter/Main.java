package Adapter;

import Builder.Student;

import javax.annotation.processing.SupportedSourceVersion;
import java.lang.annotation.Target;

public class Main {
    public static void main(String[] args) {
        TargetAdapter targetAdapter=new TargetAdapter(new TestSupplier());
        test(targetAdapter);
    }

    public static void test(TargetTest targetTest){
        System.out.println(targetTest.supply());
    }
}
