package com.mytel.plan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytel.plan.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer> {

}
