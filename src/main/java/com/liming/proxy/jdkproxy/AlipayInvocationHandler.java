package com.liming.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AlipayInvocationHandler implements InvocationHandler {
    private Object targetObject;

    public AlipayInvocationHandler(Object targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("begin");
        Object result = method.invoke(targetObject, args);
        System.out.println("end");
        return result;
    }

    public static void main(String[] args) {
        AliPay aliPay = new AliPayImpl();
        AlipayInvocationHandler alipayInvocationHandler = new AlipayInvocationHandler(aliPay);
        AliPay pay = (AliPay) Proxy.newProxyInstance(
                aliPay.getClass().getClassLoader(),
                aliPay.getClass().getInterfaces(),
                alipayInvocationHandler
        );
        pay.pay();
    }
}
