package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Order;

import java.util.List;

public interface OrderService
{
   Order findOrderByNumber(long ordnum);
}
