package com.springLearn.controller.impl;

import com.springLearn.controller.AccountController;
import com.springLearn.service.AccountService;

/**
 *
 */
public class AccountControllerImpl implements AccountController {
    private AccountService accountService;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public void save() {
        System.out.println("accountController save");
        accountService.insert();
        System.out.println("accountController save end");
    }
}
