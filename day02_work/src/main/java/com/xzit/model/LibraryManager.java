package com.xzit.model;

import java.util.List;

public class LibraryManager {
    private String name;
    List<Reader> readers;

    public LibraryManager() {
    }

    public LibraryManager(String name, List<Reader> readers) {
        this.name = name;
        this.readers = readers;
    }
    public void validate() {
        for (Reader reader : readers) {
            switch (reader.getCard()) {
                case "红色A类":
                    System.out.println(reader.getName()+"借到《Java基础图书》");
                    break;
                case "红色B类":
                    System.out.println(reader.getName()+"借到《html》");
                    break;
                case "蓝色A类":
                    System.out.println(reader.getName()+"借到《Oracle数据库》");
                    break;
                default:
                    System.out.println(reader.getName()+"借到《三国演义》");
                    break;
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
     * @return readers
     */
    public List<Reader> getReaders() {
        return readers;
    }

    /**
     * 设置
     * @param readers
     */
    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    public String toString() {
        return "LibraryManager{name = " + name + ", readers = " + readers + "}";
    }
}
