package com.mytel.customer.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {
	long phoneNo;
	String password;
	
	@Override
	public String toString() {
		return "LoginDTO [phoneNo=" + phoneNo + ", password=" + password + "]";
	}

}
