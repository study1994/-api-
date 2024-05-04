package com.test.dao;
import com.test.bean.UserInfo;
public interface IUserInfoDao{
    public UserInfo queryUserInfoByUid(Integer uid);
}

