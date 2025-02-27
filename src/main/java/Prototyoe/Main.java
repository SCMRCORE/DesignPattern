package Prototyoe;

import Factory.*;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        MyClass myClass = new MyClass(new NestedClass());
        MyClass myClass1 = (MyClass) myClass.clone();
        System.out.println(myClass.getNestedObject()==myClass1.getNestedObject());
    }
}

