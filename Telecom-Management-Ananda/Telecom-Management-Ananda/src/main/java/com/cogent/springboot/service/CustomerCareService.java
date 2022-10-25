package com.cogent.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cogent.springboot.entity.CustomerCare;

@Service
public interface CustomerCareService {
	public CustomerCare addCustomerCare(CustomerCare customerCare);
	public void deleteCustomerCareById(Long customerCareId);
	public List<CustomerCare> viewAllCustomerCare();
}
