package com.lambdaschool.orders.models;

import javax.persistence.*;

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

   @ManyToMany
   @JoinTable
}
