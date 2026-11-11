package com.springLearn.service.impl;

import com.springLearn.dao.AccountDao;
import com.springLearn.service.AccountService;

/**
 *
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void insert() {
        System.out.println("accountService save");
        accountDao.insert();
        System.out.println("accountService save end");
    }
}
