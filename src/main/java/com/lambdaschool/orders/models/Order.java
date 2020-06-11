package com.lambdaschool.orders.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long ordnum;

   @Column(nullable = false)
   private double ordamount;
   private double advanceamount;
   private String orderdescription;

   @ManyToMany()
   @JoinTable(name = "orderpayments",
   joinColumns = @JoinColumn(name = "ordnum"),
   inverseJoinColumns = @JoinColumn(name = "paymentid"))
   private List<Payment> payments = new ArrayList<>();

   @ManyToOne
   @JoinColumn(name = "custcode", nullable = false)
   private Customer customer;
}
