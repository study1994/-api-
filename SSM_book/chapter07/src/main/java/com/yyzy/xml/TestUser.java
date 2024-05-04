package com.yyzy.xml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Userbean.xml");
        // 通过 Bean 生成 User 对象
        User user = (User) applicationContext.getBean("user");
        // 输出结果用户名
        System.out.println(user.getUsername());

        // 通过 Bean 生成 User 对象
        User user2 = (User) applicationContext.getBean("user2");
        // 输出结果用户名
        System.out.println(user2.getUsername());

        // 通过 Bean 生成 User 对象
        User user3 = (User) applicationContext.getBean("user3");
        // 输出结果猫名
        System.out.println(user3.getCat().getName());
    }
}

