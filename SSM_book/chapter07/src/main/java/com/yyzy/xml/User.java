package com.yyzy.xml;
import com.yyzy.bean.po.Cat;

public class User {
    private String username;
    private String sex;
    private Integer age;
    private Cat cat;

    public User() {
    }

    public User(String username,String sex,Integer age) {
        this.username=username;
        this.sex=sex;
        this.age=age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getUsername() {
        return username;
    }

    public String getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public Cat getCat() {
        return cat;
    }
}
