package com.xzit.model;

public class Teacher {
    private String name;
    private String addr;

    public Teacher() {
    }

    public Teacher(String name, String addr) {
        this.name = name;
        this.addr = addr;
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
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置
     * @param addr
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String toString() {
        return "Teacher{name = " + name + ", addr = " + addr + "}";
    }
}
