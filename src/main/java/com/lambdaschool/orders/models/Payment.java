package com.lambdaschool.orders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "payments")
public class Payment
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long paymentid;
   @Column(nullable = false, unique = true)
   private String type;

   @ManyToMany(mappedBy = "payments")
   @JsonIgnoreProperties(value = "payments")
   List<Order> orders = new ArrayList<>();
}
