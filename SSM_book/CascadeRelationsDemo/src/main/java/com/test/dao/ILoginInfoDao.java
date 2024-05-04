package com.test.dao;

import com.test.bean.LoginInfo;
import org.apache.ibatis.annotations.Param;

public interface ILoginInfoDao {
    // 登录方法
    public LoginInfo login(@Param("username") String username, @Param("password") String password);
}
