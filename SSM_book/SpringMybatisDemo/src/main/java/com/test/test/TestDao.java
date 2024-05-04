package com.test.test;

import com.test.bean.Users;
import com.test.dao.IUserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDao {

    @Autowired
    private IUserDao dao;

    @Test
    public void testInsertUser() {
        try {
            Users u = new Users(null, "com", "123456");
            int i = dao.insertUser(u);
            System.out.println(">>>" + i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDelUserByUid() {
        try {
            int i = dao.delUserByUid(103);
            System.out.println(">>>" + i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUpdateUserByUid() {
        try {
            Users u = new Users(102, "corn", "123456");
            int i = dao.updateUserByUid(u);
            System.out.println(">>>" + i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetUserByUid() {
        try {
            Users u = dao.getUserByUid(102);
            System.out.println(u);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetUserList() {
        try {
            dao.getUserList().forEach(u -> System.out.println(u));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetUserCount() {
        try {
            Long count = dao.getUserCount();
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
