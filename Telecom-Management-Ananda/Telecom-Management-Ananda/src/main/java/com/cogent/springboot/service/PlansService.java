package com.cogent.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cogent.springboot.entity.Plans;

@Service
public interface PlansService {
	public Plans addPlan(Plans plan);
	public void deletePlanById(Long planId);
	public List<Plans> viewAllPlans();
}
