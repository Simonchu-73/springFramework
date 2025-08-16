package com.xzit.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


@Aspect
@Component
public class Validate {
    @Around(value = "execution(public * com.xzit.aop.TravelVal.*(..))")
    public void doValidate(ProceedingJoinPoint joinPoint) throws Throwable {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Object[] args = joinPoint.getArgs();
        Tourist tourist = (Tourist) args[0];
        String end = tourist.getEnd();
        String start = tourist.getStart();
        Areas bean = (Areas) context.getBean("areas");
        List<String> areas = bean.getAreas();
        if(areas.contains(start)){
            System.out.println("您的出发地"+start+"是高风险地区，禁止出行");
        }else if(areas.contains(end)){
            joinPoint.proceed(args);
            System.out.println("您的目的地"+end+"是高风险地区，本次出行将被重点记录");
            BufferedWriter bw = new BufferedWriter(new FileWriter("day05_work/src/main/resources/log.txt",true));
            bw.write("用户："+tourist.getName()+"，出发地："+start+"，目的地："+end+"，时间："+ LocalDateTime.now());
            bw.newLine();
            bw.close();
        }

    }
}
