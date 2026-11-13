package com.springLearn.annotation.Service.impl;

import com.springLearn.annotation.Service.UserService;
import com.springLearn.annotation.dao.userDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl2 implements UserService {
    @Autowired
    private userDao userDao;



    @Override
    public void save() {
        System.out.println("UserServiceImpl save Start");
        userDao.save();
        System.out.println("UserServiceImpl save End");
    }
}
