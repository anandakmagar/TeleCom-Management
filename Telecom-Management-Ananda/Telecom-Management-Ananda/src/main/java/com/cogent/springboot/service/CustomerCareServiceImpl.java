package com.cogent.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springboot.entity.CustomerCare;
import com.cogent.springboot.repo.CustomerCareRepo;

@Service
public class CustomerCareServiceImpl implements CustomerCareService {
	@Autowired
	CustomerCareRepo customerCareRepo;
	

	@Override
	public CustomerCare addCustomerCare(CustomerCare customerCare) {
		return customerCareRepo.save(customerCare);
	}

	@Override
	public void deleteCustomerCareById(Long customerCareId) {
		customerCareRepo.deleteById(customerCareId);
	}

	@Override
	public List<CustomerCare> viewAllCustomerCare() {
		return customerCareRepo.findAll();
	}

}
