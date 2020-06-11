package com.lambdaschool.orders.controllers;

import com.lambdaschool.orders.models.Customer;
import com.lambdaschool.orders.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController
{
   @Autowired
   private CustomerService customerService;

   @GetMapping(value = "/customers",
   produces = {"application/json"})
   public ResponseEntity<?> listAllRestaurants()
   {
      List<Customer> allCustomers = customerService.findAllCustomers();
      (allCustomers, HttpStatus.OK);
   }
}
