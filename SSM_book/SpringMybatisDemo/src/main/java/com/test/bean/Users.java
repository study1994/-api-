package com.test.bean;

public class Users {
    private Integer id;
    private String name;
    private String pwd;

    public Users() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Users(Integer id, String name, String pwd) {
        super();
        this.id = id;
        this.name = name;
        this.pwd = pwd;
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
