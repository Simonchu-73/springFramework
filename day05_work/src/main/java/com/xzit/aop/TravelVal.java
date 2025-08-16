package com.xzit.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TravelVal {

    public  void travel(Tourist tourist) {
        System.out.println("你好，"+tourist.getName()+"，欢迎乘坐从"+tourist.getStart()+"地到"+tourist.getEnd()+"地的航班");

    }
}
