package com.xzit.model;

import lombok.Data;

import java.math.BigDecimal;

public class User {
    private String name;
    private BigDecimal salary;

    public User() {
    }

    public User(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
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
     * @return salary
     */
    public BigDecimal getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String toString() {
        return "User{name = " + name + ", salary = " + salary + "}";
    }
}
