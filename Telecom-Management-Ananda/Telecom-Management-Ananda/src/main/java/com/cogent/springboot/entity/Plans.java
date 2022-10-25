package com.cogent.springboot.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Plans {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long planId;
	private String planName;
	private int planCost;
	private String planValidity;
	public Plans() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plans(Long planId, String planName, int planCost, String planValidity) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.planCost = planCost;
		this.planValidity = planValidity;
	}
	public Long getPlanId() {
		return planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public int getPlanCost() {
		return planCost;
	}
	public void setPlanCost(int planCost) {
		this.planCost = planCost;
	}
	public String getPlanValidity() {
		return planValidity;
	}
	public void setPlanValidity(String planValidity) {
		this.planValidity = planValidity;
	}
	@Override
	public int hashCode() {
		return Objects.hash(planCost, planId, planName, planValidity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plans other = (Plans) obj;
		return planCost == other.planCost && Objects.equals(planId, other.planId)
				&& Objects.equals(planName, other.planName) && Objects.equals(planValidity, other.planValidity);
	}
	
	
}