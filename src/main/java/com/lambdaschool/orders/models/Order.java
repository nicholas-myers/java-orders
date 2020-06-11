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

   @ManyToMany
   @JoinTable(name = "orderpayments",
   joinColumns = @JoinColumn(name = "ordnum"),
   inverseJoinColumns = @JoinColumn(name = "paymentid"))
   private List<Payment> payments = new ArrayList<>();

   @ManyToOne
   @JoinColumn(name = "custcode", nullable = false)
   private Customer customer;

   public Order() {
   }

   public Order(double ordamount, double advanceamount, String orderdescription, List<Payment> payments, Customer customer) {
      this.ordamount = ordamount;
      this.advanceamount = advanceamount;
      this.orderdescription = orderdescription;
      this.payments = payments;
      this.customer = customer;
   }

   public long getOrdnum() {
      return ordnum;
   }

   public void setOrdnum(long ordnum) {
      this.ordnum = ordnum;
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

   public String getOrderdescription() {
      return orderdescription;
   }

   public void setOrderdescription(String orderdescription) {
      this.orderdescription = orderdescription;
   }

   public List<Payment> getPayments() {
      return payments;
   }

   public void setPayments(List<Payment> payments) {
      this.payments = payments;
   }

   public Customer getCustomer() {
      return customer;
   }

   public void setCustomer(Customer customer) {
      this.customer = customer;
   }

   @Override
   public String toString() {
      return "Order{" +
              "ordnum=" + ordnum +
              ", ordamount=" + ordamount +
              ", advanceamount=" + advanceamount +
              ", orderdescription='" + orderdescription + '\'' +
              ", payments=" + payments +
              ", customer=" + customer +
              '}';
   }
}
