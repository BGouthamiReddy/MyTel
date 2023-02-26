package com.mytel.plan.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlanDTO {

	Integer planId;
	
	String planName;

	Integer nationalRate;

	Integer localRate;
	
	@Override
	public String toString() {
		return "PlanDTO [planId=" + planId + ", planName=" + planName + ", nationalRate=" + nationalRate
				+ ", localRate=" + localRate + "]";
	}
}
