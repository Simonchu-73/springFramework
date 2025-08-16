package com.xzit.work;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xzit.model.User;


public class HomeWork1 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user= (User)context.getBean("user");
        System.out.println(user);
    }
}
