package com.xzit.work;

import com.xzit.model.BathManager;
import com.xzit.model.LibraryManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeWork {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BathManager bathManager = (BathManager) context.getBean("manager");
        bathManager.validate();
        LibraryManager libraryManager = (LibraryManager) context.getBean("libraryManager");
        libraryManager.validate();
    }
}
