package Proxy.BaseProxy;

public class Proxy extends Subject {

    private Subject target;

    public Proxy(Subject subject){
        this.target=subject;
    }

    @Override
    public void test() {
        System.out.println("代理前置");
        target.test();
        System.out.println("代理后置");
    }
}
