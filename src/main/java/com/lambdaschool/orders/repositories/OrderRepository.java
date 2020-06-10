package com.lambdaschool.orders.repositories;

import com.lambdaschool.orders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Customer, Long>
{
}
