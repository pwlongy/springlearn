package com.springLearn.annotation.Service.impl;

import com.springLearn.annotation.Service.UserService;
import com.springLearn.annotation.dao.userDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
@Repository("UserService") // @Repository 可以指定注入的名称
public class UserServiceImpl implements UserService {
    @Autowired
    private userDao userDao;



    @Override
    public void save() {
        System.out.println("UserServiceImpl save Start");
        userDao.save();
        System.out.println("UserServiceImpl save End");
    }
}
