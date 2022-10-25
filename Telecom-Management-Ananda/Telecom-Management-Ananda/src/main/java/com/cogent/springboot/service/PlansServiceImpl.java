package com.cogent.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springboot.entity.Plans;
import com.cogent.springboot.repo.PlansRepo;

@Service
public class PlansServiceImpl implements PlansService{
	@Autowired
	PlansRepo plansRepo;

	@Override
	public Plans addPlan(Plans plan) {
		return plansRepo.save(plan);
	}

	@Override
	public void deletePlanById(Long planId) {
		plansRepo.deleteById(planId);
	}

	@Override
	public List<Plans> viewAllPlans() {
		return plansRepo.findAll();
	}
}

