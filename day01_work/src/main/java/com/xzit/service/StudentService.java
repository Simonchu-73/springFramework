package com.xzit.service;

import com.xzit.dao.impl.StudentDaoMysqlImpl;
import com.xzit.dao.impl.StudentDaoOracleImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentService {
    private static final ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
    public void save(String database) {
        if("mysql".equals(database)) {
            StudentDaoMysqlImpl daoMysqlImpl = (StudentDaoMysqlImpl) context.getBean("StudentDaoMysqlImpl");
            daoMysqlImpl.save();

        } else if("oracle".equals(database)) {
            StudentDaoOracleImpl daoOracleImpl = (StudentDaoOracleImpl) context.getBean("StudentDaoOracleImpl");
            daoOracleImpl.save();
        }else{
            System.out.println("没有匹配数据库");
        }
    }

}
