package com.mytel.calldetails.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.mytel.calldetails.dto.CallDetailsDTO;

public interface CallDetailsService {

	public List<CallDetailsDTO> getCustomerCallDetails(@PathVariable long phoneNo);
}
