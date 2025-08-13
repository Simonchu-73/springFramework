package com.xzit.model;

import java.util.List;

public class BathManager {
    private String name;
    private List<Student> students;

    public BathManager() {
    }

    public BathManager(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }
    public void validate(){
        for (Student student : students) {
            if("女".equals(student.getGender())){
                System.out.println("姓名："+student.getName()+" 性别："+student.getGender()+" 禁止进入男澡堂");
            }else{
                System.out.println("姓名："+student.getName()+" 性别："+student.getGender()+" 允许进入男澡堂");
            }
        }
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * 设置
     * @param students
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String toString() {
        return "BathManager{name = " + name + ", students = " + students + "}";
    }
}
