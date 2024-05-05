package com.test.factory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.Reader;
import java.io.IOException;
import java.io.InputStream;

public class MybatisFactory{
    private static SqlSessionFactory ssf;
    private static SqlSession session;
    static{
        try{
            Reader reader=Resources.getResourceAsReader("Mybatis-config.xml");
            ssf = new SqlSessionFactoryBuilder().build(reader);
            reader.close(); // 关闭Reader
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static SqlSession openSession(){
        session = ssf.openSession();
        return session;
    }
}