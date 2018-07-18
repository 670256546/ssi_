package com.sc.entity;

/**
 * @Auther: hushuang
 * @Date: 2018/7/9 17:02
 * @Description:
 */
public class User {

    private Integer id;
    private  String name;

    public User() {
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
