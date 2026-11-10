package com.springLearn.dao.impl;

import com.springLearn.dao.OrderDao;

/**
 *
 */
public class OrderDaoImpl implements OrderDao {
    @Override
    public void insert() {
        System.out.println("保存订单信息");
    }
}
