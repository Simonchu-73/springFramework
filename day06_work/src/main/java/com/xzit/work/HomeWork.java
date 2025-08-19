package com.xzit.work;

import com.xzit.model.GameAccount;
import com.xzit.service.GameAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        GameAccountService gameAccountService =(GameAccountService) context.getBean("gameAccountServiceImpl");
        GameAccount account=new GameAccount();
        account.setAccount("lisi123").setPassword("111222").setCoupon(6480);
        /*使用 spring 整合 mybatis 技术，完成对表中数据的增加和显示*/
        System.out.println("数据增加，影响行数");
        int insert = gameAccountService.insert(account);
        System.out.println("数据显示");
        List<GameAccount> gameAccounts = gameAccountService.selectList();
        gameAccounts.forEach(System.out::println);
        System.out.println("------------------------------");
        /*使用 spring 整合 mybatis 技术，完成用户登录处理*/
        GameAccount login = new GameAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账户：");
        String accountName = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();
        login.setAccount(accountName).setPassword(password);
        GameAccount loginResult = gameAccountService.login(login);
        if (loginResult != null) {
            System.out.println("恭喜你！登入成功");
        }else{
            System.out.println("账号或密码错误");
        }

    }
}
