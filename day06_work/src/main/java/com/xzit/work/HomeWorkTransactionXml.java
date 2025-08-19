package com.xzit.work;

import com.xzit.model.GameAccount;
import com.xzit.service.GameAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeWorkTransactionXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        GameAccountService gameAccountService =(GameAccountService) context.getBean("gameAccountServiceImplXml");
        GameAccount account=new GameAccount(); account.setAccount("lisi123").setPassword("111222");
        GameAccount login = gameAccountService.login(account);
        gameAccountService.couponUpdate(login,-300);
        gameAccountService.couponUpdate(login,500);
    }
}
