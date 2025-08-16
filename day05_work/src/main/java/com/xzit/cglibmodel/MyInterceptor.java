package com.xzit.cglibmodel;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyInterceptor implements MethodInterceptor {
    private static Object obj;

    public MyInterceptor(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        String fullMethodSignature = method.getDeclaringClass().getName() + "." + method.getName();
        Object result = null;
        String targetName = obj.getClass().getName();
        if (fullMethodSignature.contains("query")) {
            System.out.println(fullMethodSignature);
            System.out.println("你好欢迎光临");
            result = method.invoke(obj, objects);
            System.out.println("--------------------------------");
        } else if ("com.xzit.cglibmodel.Waiter.pay".equals(fullMethodSignature)) {
            System.out.println(fullMethodSignature);
            result = method.invoke(obj, objects);
            System.out.println("请带好您的随身物品，慢走欢迎再来");
            System.out.println("--------------------------------");
        } else {
            System.out.println(fullMethodSignature);
            result = method.invoke(obj, objects);
            System.out.println("慢走,欢迎再来");
            System.out.println("--------------------------------");
        }
        return result;
    }

}

