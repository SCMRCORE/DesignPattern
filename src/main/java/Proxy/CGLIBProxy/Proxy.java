package Proxy.CGLIBProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.invoke.MethodHandleInfo;
import java.lang.reflect.Method;

public class Proxy implements MethodInterceptor {

    private Object target;

    public Proxy(Object subject){
        this.target=subject;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("现在是由CGLIB代理："+o.getClass());
        return method.invoke(target, objects);
    }
}
