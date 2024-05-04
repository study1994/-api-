package com.test.factory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.Reader;
import java.io.IOException;
import java.io.InputStream;

public class MybatisFactory{
    private static SqlSessionFactoryssf;
    private static SqlSessionsession;
    static{
        try{
            Reader reader=Resources.getResourceAsReader("Mybatis-config.xml");
            ssf = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
        public static SqlSessionopenSession(){
            session=ssf.openSession();
            return session;
        }
    }
}