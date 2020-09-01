package com.demo.eligibility2;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EligibilityController {

	
	@RequestMapping(path="/eligibility", method= {RequestMethod.POST})	
	public @ResponseBody Customer getEligibility(@RequestBody Customer cust) {
		System.out.println("/eligibility for " + cust);
		cust.setProfile("Silver");
		
		cust.setOfferedProducts("Freedom Combo M, Freedom Combo L");
		cust.setRecommendation("Freedom Gold");
		return  cust;
		
	}
	
}
