package com.mytel.plan.service;

import java.util.List;

import com.mytel.plan.dto.PlanDTO;

public interface PlanService {
	public List<PlanDTO> getAllPlans();
	public PlanDTO getSpecificPlan(int planId);

}
