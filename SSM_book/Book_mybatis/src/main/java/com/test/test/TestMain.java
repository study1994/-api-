package com.test.test;

import com.test.bean.Book;
import com.test.dao.IBookDao;
import com.test.factory.MybatisFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMain {
    IBookDao dao = null;
    SqlSession session = null;

    @Before
    public void before() {
        session = MybatisFactory.openSession();
        dao = session.getMapper(IBookDao.class);
    }

    @After
    public void after() {
        session.commit();
        session.close();
    }

    @Test
    public void testInsert() throws Exception {
        Book book = new Book(null, "十万个为什么", 1, 59.9, "没有啥简介");
        int i = dao.insertBook(book);
        System.out.println(i);
    }

    @Test
    public void testUpdate() throws Exception {
        Book book = new Book(2, "十万个为什么", 2, 60.0, "没有啥简介");
        int i = dao.updateBookByBid(book);
        System.out.println(i);
    }

    @Test
    public void testDelete() throws Exception {
        int i = dao.deleteBookByBid(3);
        System.out.println(i);
    }

    @Test
    public void testQueryByBid() throws Exception {
        Book book = dao.queryBookByBid(2);
        System.out.println(book);
    }

    @Test
    public void testQueryAll() throws Exception {
        List<Book> list = dao.queryAllBook();
        list.forEach(System.out::println);
    }

    @Test
    public void testQueryBookCount() throws Exception {
        int count = dao.queryBookCount();
        System.out.println(count);
    }
}
