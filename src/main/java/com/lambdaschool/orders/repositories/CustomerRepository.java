package com.lambdaschool.orders.repositories;

import com.lambdaschool.orders.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long>
{
   ArrayList<Customer> findByNameContainingIgnoringCase(String likename);
}
