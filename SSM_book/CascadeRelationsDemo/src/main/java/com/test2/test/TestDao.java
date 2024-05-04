package com.test2.test;

import com.test.bean.LoginInfo;
import com.test.dao.ILoginInfoDao;
import com.test.factory.MyBatisFactory;
import com.test2.bean.Classes;
import com.test2.dao.IClassesDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

public class TestDao {
    IClassesDao dao;

    @Before
    public void before() {
        SqlSession session = MyBatisFactory.openSession();
        dao = session.getMapper(IClassesDao.class);
    }

    @Test
    public void testQueryClassesByCid() {
        Classes cls = dao.queryClassesByCid(1);
        System.out.println(cls.getCid() + "--" + cls.getCname());
        cls.getStudents().forEach(s -> System.out.println(s.getSname()));
    }
}
