package com.xzit.jdkmodel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
    private Object obj;
    public MyHandler(Object obj){
        this.obj=obj;
    }
    @Override
    public Object invoke(Object proxy,Method method, Object[] args) throws Throwable {
        String fullMethodSignature = method.getDeclaringClass().getName() + "." + method.getName();
        Object result = null;
        String targetName = obj.getClass().getName();
        if("com.xzit.jdkmodel.Staff.query".equals(fullMethodSignature)){
            System.out.println(fullMethodSignature);
            System.out.println(targetName);
            System.out.println("你好欢迎光临");
           result=  method.invoke(obj,args);
            System.out.println("--------------------------------");
        }else  {
            System.out.println(fullMethodSignature);
            System.out.println(targetName);
            if("com.xzit.jdkmodel.Waiter".equals(targetName)){
               result= method.invoke(obj,args);
                System.out.println("请带好您的随身物品，欢迎再来");
                System.out.println("--------------------------------");
            }else{
                result= method.invoke(obj,args);
                System.out.println("慢走，欢迎再来");
                System.out.println("--------------------------------");
            }

        }
        return result;
    }
}
