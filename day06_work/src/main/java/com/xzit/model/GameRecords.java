package com.xzit.model;


import java.time.LocalDateTime;

public class GameRecords {
    private int id;
    private String account;
    private LocalDateTime updateTime;
    private String category;
    private int num;

    public GameRecords() {
    }

    public GameRecords(int id, String account, LocalDateTime updatedTime, String category, int num) {
        this.id = id;
        this.account = account;
        this.updateTime = updatedTime;
        this.category = category;
        this.num = num;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return account
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取
     * @return updatedTime
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置
     * @param updateTime
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 获取
     * @return num
     */
    public int getNum() {
        return num;
    }

    /**
     * 设置
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }

    public String toString() {
        return "GameRecords{id = " + id + ", account = " + account + ", updatedTime = " + updateTime + ", category = " + category + ", num = " + num + "}";
    }
}
