package com.test.dao;
import java.util.List;
import com.test.bean.Users;

public interface IUserDao {
    // 添加用户信息
    public Integer insertUser(Users users) throws Exception;

    // 根据主键删除用户信息
    public Integer delUserByUid(Integer uid) throws Exception;

    // 根据主键修改用户信息
    public Integer updateUserByUid(Users users) throws Exception;

    // 根据主键查询用户信息
    public Users getUserByUid(Integer uid) throws Exception;

    // 查询所有用户信息
    public List<Users> getUserList() throws Exception;

    // 查询用户总数据量
    public long getUserCount() throws Exception;
}
