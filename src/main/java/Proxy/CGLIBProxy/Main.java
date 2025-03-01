package Proxy.CGLIBProxy;

import Proxy.JDKProxy.SubjectImpl;
import net.sf.cglib.proxy.Enhancer;

public class Main {

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        SubjectImpl subject = new SubjectImpl();
        Enhancer enhancer = new Enhancer();//增强器，一会就需要依靠增强器来为我们生成动态代理对象
        enhancer.setSuperclass(SubjectImpl.class);//创建被代理类子类
        enhancer.setCallback(new Proxy(subject));//设定代理逻辑
        SubjectImpl proxy = (SubjectImpl) enhancer.create();//创建代理类
        proxy.test();
    }
}

