package com.xzit.model;

public class Reader {
    private String name;
    private String card;

    public Reader() {
    }

    public Reader(String name, String card) {
        this.name = name;
        this.card = card;
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
     * @return card
     */
    public String getCard() {
        return card;
    }

    /**
     * 设置
     * @param card
     */
    public void setCard(String card) {
        this.card = card;
    }

    public String toString() {
        return "Reader{name = " + name + ", card = " + card + "}";
    }
}
