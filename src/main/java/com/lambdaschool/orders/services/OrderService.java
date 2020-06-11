package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Order;

import java.util.List;

public interface OrderService
{
   List<Order> findAllOrders();
   Order findOrderByNumber(long ordnum);
}
