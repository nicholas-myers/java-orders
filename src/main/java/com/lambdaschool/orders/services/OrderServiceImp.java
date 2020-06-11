package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Order;
import com.lambdaschool.orders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;


@Service(value = "orderService")
public class OrderServiceImp implements OrderService {
   @Autowired
   private OrderRepository orderrepos;

   @Override
   public Order findOrderByNumber(long ordnum)
           throws EntityNotFoundException {
      return orderrepos.findById(ordnum)
              .orElseThrow(() -> new EntityNotFoundException("Order " + ordnum + " Not Found"));
   }
}
