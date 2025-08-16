package com.xzit.jdkmodel;

public class TestJDKProxy {
    public static void main(String[] args) {
        Waiter waiter=new Waiter();
        SalesMan salesMan=new SalesMan();
        Staff waiterProxy =(Staff) ProxyUtil.getProxy(waiter, new MyHandler(waiter));
        Staff salesManProxy =(Staff) ProxyUtil.getProxy(salesMan, new MyHandler(salesMan));

        waiterProxy.query();
        waiterProxy.pay();
        salesManProxy.query();
        salesManProxy.pay();
    }
}
