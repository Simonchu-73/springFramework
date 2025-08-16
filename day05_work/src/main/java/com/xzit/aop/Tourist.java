package com.xzit.aop;

import org.springframework.stereotype.Component;

@Component
public class Tourist {
    private String name;
    private String start;
    private String end;

    public Tourist() {
    }

    public Tourist(String name, String start, String end) {
        this.name = name;
        this.start = start;
        this.end = end;
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
     * @return start
     */
    public String getStart() {
        return start;
    }

    /**
     * 设置
     * @param start
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * 获取
     * @return end
     */
    public String getEnd() {
        return end;
    }

    /**
     * 设置
     * @param end
     */
    public void setEnd(String end) {
        this.end = end;
    }

    public String toString() {
        return "Tourist{name = " + name + ", start = " + start + ", end = " + end + "}";
    }
}
