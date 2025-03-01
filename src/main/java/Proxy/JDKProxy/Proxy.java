package Proxy.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy implements InvocationHandler {

    private Object object;

    public Proxy(Object object){
        this.object = object;
    }

    @Override//调用代理对象方法时会进入
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理对象："+proxy.getClass());
        Object res = method.invoke(object, args);//代理对象方法调用
        System.out.println("方法调用完成，返回值:"+res);
        return res;
    }
}
