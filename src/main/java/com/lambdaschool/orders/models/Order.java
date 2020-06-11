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
   private long ordernumber;

   @Column(nullable = false)
   private double orderamount;
   private double advanceamount;
   private String orderdescription;

   @ManyToOne
   @JoinColumn(name = "customercode", nullable = false)
   private Customer customer;

   @ManyToMany()
   @JoinTable(name = "orderpayments",
   joinColumns = @JoinColumn(name = "ordernumber"),
   inverseJoinColumns = @JoinColumn(name = "paymentid"))
   private List<Payment> payments = new ArrayList<>();
}
