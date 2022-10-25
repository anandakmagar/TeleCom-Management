package com.cogent.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.springboot.entity.Plans;

@Repository
public interface PlansRepo extends JpaRepository<Plans, Long>{

}
