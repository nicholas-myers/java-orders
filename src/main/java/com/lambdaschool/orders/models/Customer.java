package com.lambdaschool.orders.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long customercode;

   @Column(nullable = false)
   private String customername;

   private String customercity;
   private String customerworkingarea;
   private String customercountry;
   private String grade;
   private double openingamount;
   private double receiveamount;
   private double paymentamount;
   private double outstandingamount;
   private String phone;

   @ManyToOne
   @JoinColumn(name = "agentcode", nullable = false)
   private Agent agent;

   @OneToMany(mappedBy = "customer",
   cascade = CascadeType.ALL,
   orphanRemoval = true)
   List<Order> orders = new ArrayList<>();

}
