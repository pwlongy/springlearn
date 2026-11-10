package com.springLearn.controller.impl;

import com.springLearn.controller.UserController;
import com.springLearn.service.UserService;

/**
 *
 */
public class UserControllerImpl implements UserController{
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @Override
    public void insert() {
        System.out.println("userController save begin");
        userService.insert();
        System.out.println("userController save end");
    }
}
