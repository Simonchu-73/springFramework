package com.xzit.jdkmodel;

public class Waiter implements Staff{
    public Waiter() {
    }

    @Override
    public void query(){
        System.out.println("请看一下菜单");
    }
    @Override
    public void pay(){
        System.out.println("请扫码支付");
    }
}
