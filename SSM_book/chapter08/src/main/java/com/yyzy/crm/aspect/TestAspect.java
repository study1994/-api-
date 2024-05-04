package com.yyzy.crm.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yyzy.crm.service.UserDao;

public class TestAspect {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        // 从 Spring 容器获取内容
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        // 执行方法
        userDao.addUser();
        userDao.deleteUser();
    }
}
