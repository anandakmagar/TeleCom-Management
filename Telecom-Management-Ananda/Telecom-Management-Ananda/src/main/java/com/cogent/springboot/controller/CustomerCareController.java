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

import com.cogent.springboot.entity.CustomerCare;
import com.cogent.springboot.service.CustomerCareService;

@RestController
@RequestMapping("/api/customercare")
public class CustomerCareController {
	@Autowired
	CustomerCareService customerCareService;
	
	@PostMapping("/add-customercare")
	public CustomerCare addCustomerCare(@RequestBody CustomerCare customerCare) {
		return customerCareService.addCustomerCare(customerCare);
	}
	
	@DeleteMapping("/delete-customercare/{id}")
	public String deleteCustomerCareById(@PathVariable("id") Long customerCareId) {
		customerCareService.deleteCustomerCareById(customerCareId);
		return "Record has been successfully deleted";
	}
	
	@GetMapping("/view-all")
	public List<CustomerCare> viewAllCustomerCare(){
		return customerCareService.viewAllCustomerCare();
	}
}