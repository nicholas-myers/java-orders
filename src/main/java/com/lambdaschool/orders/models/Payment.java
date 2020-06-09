package com.lambdaschool.orders.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Payment
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long paymentid;
   @Column(nullable = false, unique = true)
   private String type;
}
