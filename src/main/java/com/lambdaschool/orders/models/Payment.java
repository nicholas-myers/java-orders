package com.lambdaschool.orders.models;

import javax.persistence.*;

public class Payment
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long paymentid;
   @Column(nullable = false, unique = true)
   private String type;

   @ManyToMany
   @JoinTable
}
