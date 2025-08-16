package com.xzit.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Tourist tourist1 = (Tourist) context.getBean("tourist1");
        TravelVal travelVal = (TravelVal) context.getBean("travelVal");
        travelVal.travel(tourist1);
        Tourist tourist2 = (Tourist) context.getBean("tourist2");
        travelVal.travel(tourist2);
    }
}
