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
   private String workingarea;
   private double commission;
   private int phone;
   private String country;

   @OneToMany(mappedBy = "agent",
   cascade = CascadeType.ALL,
   orphanRemoval = true)
   List<Customer> customers = new ArrayList<>();

}
