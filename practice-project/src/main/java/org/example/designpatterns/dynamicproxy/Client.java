package org.example.designpatterns.dynamicproxy;

import java.lang.reflect.Proxy;

public class Client {


    public static void main(String[] args) {
        RealInterface obj = (RealInterface) Proxy.newProxyInstance(Client.class.getClassLoader(),
                new Class[]{RealInterface.class}, new ProxyClass(new RealObject()));
        obj.print("karuna");
    }
}
