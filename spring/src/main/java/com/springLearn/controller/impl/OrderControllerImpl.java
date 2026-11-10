package com.springLearn.controller.impl;

import com.springLearn.controller.OrderController;
import com.springLearn.service.OrderService;

/**
 *
 */
public class OrderControllerImpl implements OrderController {
    public OrderService orderService;

    public OrderControllerImpl(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void insert() {
        System.out.println("orderController save begin");
        orderService.insert();
        System.out.println("orderController save end");
    }
}
