package com.lambdaschool.orders.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agents")
public class Agent
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long agentcode;

   @Column(nullable = false)
   private String agentname;

   private double commission;
   private String country;
   private int phone;
   private String workingarea;

   @OneToMany(mappedBy = "agent",
   cascade = CascadeType.ALL,
   orphanRemoval = true)
   List<Customer> customers = new ArrayList<>();
}
