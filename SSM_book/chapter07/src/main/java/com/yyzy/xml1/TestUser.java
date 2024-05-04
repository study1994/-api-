package com.yyzy.xml1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml1User.xml");

        // 通过 Bean 生成 User 对象
        User user = (User) applicationContext.getBean("user");

        // 输出结果
        System.out.println(user.toString());
    }
}
