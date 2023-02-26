package com.mytel.calldetails.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.mytel.calldetails.dto.CallDetailsDTO;
import com.mytel.calldetails.entity.CallDetails;
import com.mytel.calldetails.repository.CallDetailsRepo;
import com.mytel.calldetails.service.CallDetailsService;

@Service
public class CallDetailsServiceImpl implements CallDetailsService {
	
	@Autowired
	private CallDetailsRepo callDetailsRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<CallDetailsDTO> getCustomerCallDetails(@PathVariable long phoneNo) {
		List<CallDetails> callDetails = callDetailsRepo.findByCalledBy(phoneNo);
		
		List<CallDetailsDTO> callsDTO = new ArrayList<CallDetailsDTO>();
		for (CallDetails call : callDetails) {
			callsDTO.add(this.modelMapper.map(call, CallDetailsDTO.class));
		}
		return callsDTO;
	}
	

}
