package com.yyzy.xml2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml2User.xml");
        // 通过 Bean 生成 User 对象
        User user = (User) applicationContext.getBean("user");
        System.out.println("User Info:");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Sex: " + user.getSex());
        System.out.println("Age: " + user.getAge());

        Cat cat = user.getCat();
        System.out.println("\nCat Info:");
        System.out.println("Cat Name: " + cat.getCname());
        System.out.println("Cat Age: " + cat.getAge());
    }
}