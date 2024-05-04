package com.yyzy.crm;
import org.springframework.stereotype.Service;

@Service("user")
public class UserDao {
    public void addUser() {
        System.out.println("添加用户");
    }

    public void deleteUser() {
        System.out.println("删除用户");
    }
}
