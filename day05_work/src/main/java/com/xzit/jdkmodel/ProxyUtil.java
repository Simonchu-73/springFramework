package com.xzit.jdkmodel;

import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Object getProxy(Object target, MyHandler myHandler) {
      return   Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), myHandler);
    }
}
