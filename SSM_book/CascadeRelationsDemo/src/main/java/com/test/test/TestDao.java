package com.test.test;

import com.test.bean.LoginInfo;
import com.test.dao.ILoginInfoDao;
import com.test.factory.MyBatisFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

public class TestDao {
    ILoginInfoDao dao;

    @Before
    public void before() {
        SqlSession session = MyBatisFactory.openSession();
        dao = session.getMapper(ILoginInfoDao.class);
    }

    @Test
    public void testLogin() {
        LoginInfo loginInfo = dao.login("root", "1234");
        System.out.println(loginInfo + "---" + loginInfo.getUserInfo().getName());
    }
}
