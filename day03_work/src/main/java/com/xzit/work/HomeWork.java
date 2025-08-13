package com.xzit.work;

import com.xzit.service.TeamService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeWork {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        TeamService service = (TeamService) context.getBean("teamService");
        service.save();
        service.delete();
    }
}
