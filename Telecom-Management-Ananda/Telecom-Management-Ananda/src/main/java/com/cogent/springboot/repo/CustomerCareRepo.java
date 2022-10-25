package com.cogent.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.springboot.entity.CustomerCare;

@Repository
public interface CustomerCareRepo extends JpaRepository<CustomerCare, Long>{

}
