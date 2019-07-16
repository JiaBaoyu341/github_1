package com.itheima.domain;

/**
 * @author 刘玉保
 * @date 2019/07/14 上午 9:26
 */

public class User {
    private Integer id;
    private String name;
    private String password;

    public User() {
    }

    public User(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "用户 {" +
                "ID:" + id +
                ",姓名:" + name +
                ",密码:" + password +
                '}';
    }
}