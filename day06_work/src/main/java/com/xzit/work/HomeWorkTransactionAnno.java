package com.xzit.work;

import com.xzit.model.GameAccount;
import com.xzit.service.GameAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeWorkTransactionAnno {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        GameAccountService gameAccountService =(GameAccountService) context.getBean("gameAccountServiceImpl");
        GameAccount account=new GameAccount(); account.setAccount("lisi123").setPassword("111222");
        GameAccount login = gameAccountService.login(account);
        /*正常提交的测试*/
        gameAccountService.couponUpdate(login,-300);
        /*超时测试*/
        gameAccountService.couponUpdate(login,500);
    }
}
