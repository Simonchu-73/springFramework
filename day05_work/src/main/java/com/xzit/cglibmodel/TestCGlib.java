package com.xzit.cglibmodel;

import org.springframework.cglib.proxy.Enhancer;

public class TestCGlib {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Enhancer waiterEnhancer = new Enhancer();
        waiterEnhancer.setSuperclass(Waiter.class);
        waiterEnhancer.setClassLoader(Waiter.class.getClassLoader());
        waiterEnhancer.setCallback(new MyInterceptor(waiter));
        Waiter waiterProxy = (Waiter) waiterEnhancer.create();
        waiterProxy.pay();
        waiterProxy.query();
        SalesMan salesMan= new SalesMan();
        Enhancer salesManEnhancer = new Enhancer();
        salesManEnhancer.setSuperclass(SalesMan.class);
        salesManEnhancer.setClassLoader(SalesMan.class.getClassLoader());
        salesManEnhancer.setCallback(new MyInterceptor(salesMan));
        SalesMan salesManProxy= (SalesMan) salesManEnhancer.create();
        salesManProxy.pay();
        salesManProxy.query();

    }
}
