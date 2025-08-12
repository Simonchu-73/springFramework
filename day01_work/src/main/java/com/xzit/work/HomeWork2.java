package com.xzit.work;


import com.xzit.service.StudentService;

public class HomeWork2 {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        service.save("mysql");
        service.save("oracle");
        service.save("sqlserver");
    }
}
