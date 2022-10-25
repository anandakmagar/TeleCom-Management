package com.cogent.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.springboot.entity.Plans;
import com.cogent.springboot.service.PlansService;

@RestController
@RequestMapping("/api/plans")
public class PlansController {
	@Autowired
	PlansService plansService;
	
	@PostMapping("/add-plan")
	public Plans addPlan(@RequestBody Plans plan) {
		return plansService.addPlan(plan);
	}
	
	@DeleteMapping("/delete-plan/{id}")
	public String deletePlanById(@PathVariable("id") Long planId) {
		plansService.deletePlanById(planId);
		return "Plan has been successfully deleted";
	}
	
	@GetMapping("/view-all")
	public List<Plans> viewAllPlans(){
		return plansService.viewAllPlans();
	}
}
