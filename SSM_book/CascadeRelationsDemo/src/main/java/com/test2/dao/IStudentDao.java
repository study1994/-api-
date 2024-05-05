package com.test2.dao;

import com.test2.bean.Classes;
import com.test2.bean.Student;
import java.util.List;

public interface IStudentDao {
    /**
     * 根据cid查询学生
     * @param cid
     * @return
     */
    public List<Student> queryStudentByCid(Integer cid);
}
