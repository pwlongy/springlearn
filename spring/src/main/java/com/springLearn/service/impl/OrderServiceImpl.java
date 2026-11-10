package com.springLearn.service.impl;

import com.springLearn.dao.OrderDao;
import com.springLearn.service.OrderService;

/**
 *
 */
public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao;

    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public void insert() {
        System.out.println("orderService save begin");
        orderDao.insert();
        System.out.println("orderService save end");
    }
}
