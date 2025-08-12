package com.xzit.dao.impl;

import com.xzit.dao.StudentDao;
import com.xzit.model.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDaoOracleImpl implements StudentDao {
    @Override
    public void save() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("数据插入oracle数据库成功" + student);
    }
}
