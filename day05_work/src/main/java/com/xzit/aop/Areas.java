package com.xzit.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Areas {
    @Value("#{'${areas}'.split(',')}")
    private List<String> areas;

    public Areas() {
    }

    public Areas(List<String> areas) {
        this.areas = areas;
    }

    /**
     * 获取
     * @return areas
     */
    public List<String> getAreas() {
        return areas;
    }

    /**
     * 设置
     * @param areas
     */
    public void setAreas(List<String> areas) {
        this.areas = areas;
    }

    public String toString() {
        return "Areas{areas = " + areas + "}";
    }
}
