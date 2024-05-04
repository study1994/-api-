package com.yyzy.bean.po;
import com.yyzy.bean.factory.Cat3Factory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCat {
    public static void main(String[] args) {
        // 定义配置文件路径
        String xmlPath = "spring.xml";
        // ApplicationContext 在加载配置文件时，对 Bean 进行实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat);
        Cat cat2 = (Cat) applicationContext.getBean("cat2");
        System.out.println(cat2);
        Cat3 cat3 = (Cat3) applicationContext.getBean("cat3");
        System.out.println(cat3);
        Cat3Factory myBean3Factory = (Cat3Factory) applicationContext.getBean("myBean3Factory");
        System.out.println(myBean3Factory);
    }
}
