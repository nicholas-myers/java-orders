package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Agent;

import java.util.List;

public interface AgentService
{
   List<Agent> findAllAgents();
   Agent findAgentByCode(long agentcode);
}
