package com.com.validations;

import org.springframework.stereotype.Component;

import com.com.dto.CustomerV1;

@Component
public class CustomerValidations {
	
	public void validateCustomerDTO(CustomerV1 customer) throws Exception
	{
		if(customer == null || customer.getAge() == 0
				|| customer.getEmail() == null 
				|| customer.getName() ==null 
				|| customer.getPassword() == null 
				|| customer.getPhoneNumber() == 0)
		{
			throw new IllegalArgumentException(); 
		}
	}
	
}
