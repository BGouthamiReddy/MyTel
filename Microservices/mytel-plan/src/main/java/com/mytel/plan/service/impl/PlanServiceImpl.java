package com.mytel.plan.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytel.plan.dto.PlanDTO;
import com.mytel.plan.entity.Plan;
import com.mytel.plan.repository.PlanRepo;
import com.mytel.plan.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService {

	
	@Autowired
	PlanRepo planRepo;
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public List<PlanDTO> getAllPlans() {
		List<Plan> plans = this.planRepo.findAll();
		List<PlanDTO> planDTOs = new ArrayList<PlanDTO>();

		for (Plan plan : plans) {
			PlanDTO planDTO = this.modelMapper.map(plan, PlanDTO.class);
			planDTOs.add(planDTO);
		}
		return planDTOs;
	}

	@Override
	public PlanDTO getSpecificPlan(int planId) {
		Optional<Plan> id = this.planRepo.findById(planId);
		return this.modelMapper.map(id, PlanDTO.class);
	}

}
