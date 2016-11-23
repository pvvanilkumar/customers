package com.com.controllers;

import javax.annotation.Resource;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.com.dto.CustomerV1;
import com.com.services.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Resource(name="customerServiceImpl")
	public CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addCustomer(
            @RequestBody final CustomerV1 customerDto) throws Exception
	{
		
		customerDto.setAge(1);
		customerDto.setEmail("pvv.anilkumar@gmail.com");
		customerDto.setName("anil");
		customerDto.setPassword("Password");
		customerDto.setPhoneNumber(77955);
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(customerDto));
		//customerService.addCustomer(customerDto);
	}
	
}
