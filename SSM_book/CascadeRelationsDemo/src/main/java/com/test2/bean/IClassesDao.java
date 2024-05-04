package com.test2.dao;

import com.test2.bean.Classes;

public interface IClassesDao {
    /**
     * 根据cid查询班级信息
     * @param cid
     * @return
     */
    public Classes queryClassesByCid(Integer cid);
}
