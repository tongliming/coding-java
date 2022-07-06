package com.liming.proxy.jdkproxy;

public class AliPayImpl implements AliPay{
    @Override
    public void pay() {
        System.out.println("alipay");
    }
}
