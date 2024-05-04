package com.yyzy.crm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        // 从 Spring 容器获取内容
        UserDao userDao = (UserDao) applicationContext.getBean("user");
        // 执行方法
        userDao.addUser();
        userDao.deleteUser();
    }

}
