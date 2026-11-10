package com.springLearn.service.impl;

import com.springLearn.dao.UserDao;
import com.springLearn.service.UserService;

/**
 *
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void insert() {
        System.out.println("userService save begin");
        userDao.insert();
        System.out.println("userService save end");
    }
}
