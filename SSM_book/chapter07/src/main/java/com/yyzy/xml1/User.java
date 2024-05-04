package com.yyzy.xml1;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import com.yyzy.bean.po.Cat;


public class User {
    private String username;
    private String sex;
    private Integer age;
    private int[] a;
    private List<String> list;
    private List<Cat> listcat;
    private Map<String, String> mapl;
    private Map<String, Cat> mapcat;

    public User() {
    }

    public User(String username, String sex, Integer age, int[] a, List<String> list, List<Cat> listcat, Map<String, String> mapl, Map<String, Cat> mapcat) {
        this.username = username;
        this.sex = sex;
        this.age = age;
        this.a = a;
        this.list = list;
        this.listcat = listcat;
        this.mapl = mapl;
        this.mapcat = mapcat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public List<Cat> getListcat() {
        return listcat;
    }

    public void setListcat(List<Cat> listcat) {
        this.listcat = listcat;
    }

    public Map<String, String> getMapl() {
        return mapl;
    }

    public void setMapl(Map<String, String> mapl) {
        this.mapl = mapl;
    }

    public Map<String, Cat> getMapcat() {
        return mapcat;
    }

    public void setMapcat(Map<String, Cat> mapcat) {
        this.mapcat = mapcat;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", a=" + Arrays.toString(a) +
                ", list=" + list +
                ", listcat=" + listcat +
                ", mapl=" + mapl +
                ", mapcat=" + mapcat +
                '}';
    }
}
