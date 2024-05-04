package com.yyzy.bean.po;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Catv2 {
    public Catv2() {
        System.out.println("create cat");
    }

    public void initCat() {
        System.out.println("init");
    }

    public void destroyCat() {
        System.out.println("destroy");
    }

    public void deadCat() {
        System.out.println("wowowo");
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Catv2 cat = (Catv2) context.getBean("catv2");
        cat.deadCat();
    }
}