package com.springLearn.annotation.dao.impl;

import com.springLearn.annotation.dao.userDao;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public class UserDaoImpl implements userDao {
    @Override
    public void save() {
        System.out.println("保存用户基本信息");
    }
}
