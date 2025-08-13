package com.xzit.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Team {
    @Value("勇士队")
    private String name;
    @Value("旧金山市")
    private String address;

    public Team() {
    }

    public Team(String name, String address) {
        this.name = name;
        this.address = address;
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
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Team{name = " + name + ", address = " + address + "}";
    }
}
