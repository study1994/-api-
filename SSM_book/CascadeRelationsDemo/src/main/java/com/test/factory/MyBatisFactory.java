package com.test.factory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatisFactory {
    private static SqlSessionFactory ssf; // MyBatis SqlSessionFactory 实例
    private static SqlSession session;    // MyBatis SqlSession 实例

    static {
        try {
            // 读取 MyBatis 配置文件
            Reader reader = Resources.getResourceAsReader("MyBatis-config.xml");
            // 创建 SqlSessionFactory 实例
            ssf = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 打开一个新的 SqlSession
     *
     * @return SqlSession 实例
     */
    public static SqlSession openSession() {
        // 使用 SqlSessionFactory 打开一个新的 SqlSession
        session = ssf.openSession();
        return session;
    }
}

