package com.mytel.customer.service;

import com.mytel.customer.dto.CustomerDTO;
import com.mytel.customer.dto.LoginDTO;

public interface CustomerService {
	
	public void createCustomer(CustomerDTO custDTO);
	public CustomerDTO getCustomerProfile( Long phoneNo);
	public boolean login(LoginDTO loginDTO);

}
