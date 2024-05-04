package com.test2.bean;

import java.util.List;

public class Classes {
    private Integer cid;
    private String cname;

    // 一个班级包含多个学生，所以在班级中定义学生集合，级联查询出来的学生数据存放到该集合
    // 一个班级对应多个学生

    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}