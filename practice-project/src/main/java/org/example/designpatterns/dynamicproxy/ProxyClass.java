package org.example.designpatterns.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyClass implements InvocationHandler {
    private RealObject realObject;
    public ProxyClass(RealObject realObject) {
        this.realObject = realObject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName());
        method.invoke(realObject, args);
        return method.getName();
    }
}
