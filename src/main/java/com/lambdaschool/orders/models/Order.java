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

   @ManyToOne
   @JoinColumn(name = "custcode", nullable = false)
   private Customer customer;

   private String orderdescription;

   @ManyToMany
   @JoinTable(name = "orderspayments",
   joinColumns = @JoinColumn(name = "ordnum"),
   inverseJoinColumns = @JoinColumn(name = "paymentid"))
   private List<Payment> payments = new ArrayList<>();



   public Order() {
   }

   public Order(double ordamount, double advanceamount, Customer customer, String orderdescription) {
      this.ordamount = ordamount;
      this.advanceamount = advanceamount;
      this.customer = customer;
      this.orderdescription = orderdescription;
   }

   public double getOrdamount() {
      return ordamount;
   }

   public void setOrdamount(double ordamount) {
      this.ordamount = ordamount;
   }

   public double getAdvanceamount() {
      return advanceamount;
   }

   public void setAdvanceamount(double advanceamount) {
      this.advanceamount = advanceamount;
   }

   public Customer getCustomer() {
      return customer;
   }

   public void setCustomer(Customer customer) {
      this.customer = customer;
   }

   public String getOrderdescription() {
      return orderdescription;
   }

   public void setOrderdescription(String orderdescription) {
      this.orderdescription = orderdescription;
   }

   @Override
   public String toString() {
      return "Order{" +
              "ordnum=" + ordnum +
              ", ordamount=" + ordamount +
              ", advanceamount=" + advanceamount +
              ", customer=" + customer +
              ", orderdescription='" + orderdescription + '\'' +
              ", payments=" + payments +
              '}';
   }
}
