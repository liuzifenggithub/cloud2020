package com.test.proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TestProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(method.getName() + "执行前");
        Object invoke = methodProxy.invokeSuper(o,objects);
        System.out.println(method.getName() + "执行后");
        return invoke;
    }

    public static Object createProxy(Class clz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clz);
        enhancer.setCallback(new TestProxy());
        return enhancer.create();
    }
}
