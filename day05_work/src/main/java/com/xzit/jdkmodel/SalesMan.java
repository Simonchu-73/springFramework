package com.xzit.jdkmodel;

public class SalesMan implements Staff{
    public SalesMan() {
    }

    @Override
    public void query(){
        System.out.println("购买什么商品？");
    }
    @Override
    public void pay(){
        System.out.println("请扫码支付");
    }
}
