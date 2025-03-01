package Proxy.JDKProxy;

import Prototyoe.MyClass;
import Prototyoe.NestedClass;

import java.lang.reflect.InvocationHandler;

public class Main {

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        SubjectImpl subject = new SubjectImpl();
        InvocationHandler handler = new Proxy(subject);
        Subject proxy = (Subject) java.lang.reflect.Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                handler);
        proxy.test();
    }
}

