package com.cogent.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CustomerCare {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerCareId;
	private String customerCareDescription;
	private Long userId;
	private String customerCareStatus;
	public CustomerCare() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerCare(Long customerCareId, String customerCareDescription, Long userId, String customerCareStatus) {
		super();
		this.customerCareId = customerCareId;
		this.customerCareDescription = customerCareDescription;
		this.userId = userId;
		this.customerCareStatus = customerCareStatus;
	}
	public Long getCustomerCareId() {
		return customerCareId;
	}
	public void setCustomerCareId(Long customerCareId) {
		this.customerCareId = customerCareId;
	}
	public String getCustomerCareDescription() {
		return customerCareDescription;
	}
	public void setCustomerCareDescription(String customerCareDescription) {
		this.customerCareDescription = customerCareDescription;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getCustomerCareStatus() {
		return customerCareStatus;
	}
	public void setCustomerCareStatus(String customerCareStatus) {
		this.customerCareStatus = customerCareStatus;
	}
	@Override
	public String toString() {
		return "CustomerCare [customerCareId=" + customerCareId + ", customerCareDescription=" + customerCareDescription
				+ ", userId=" + userId + ", customerCareStatus=" + customerCareStatus + "]";
	}
	
	
}
