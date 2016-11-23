package com.com.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.com.dao.CustomerV1Dao;
import com.com.dto.CustomerV1;
import com.com.entities.CustomerEntity;
import com.com.services.CustomerService;
import com.com.validations.CustomerValidations;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Resource
	CustomerValidations validateCustomer;
	
	@Resource
	CustomerV1Dao customerDao;
	
	@Override
	public void addCustomer(CustomerV1 customerDto) throws Exception {
		
		CustomerEntity customerEntity = new CustomerEntity();
		validateCustomer.validateCustomerDTO(customerDto);
		
		customerEntity.setAge(customerDto.getAge());
		customerEntity.setEmail(customerDto.getEmail());
		customerEntity.setName(customerDto.getName());
		customerEntity.setPassword(customerDto.getPassword());
		customerEntity.setPhoneNumber(customerDto.getPhoneNumber());
		
		customerDao.addCustomer(customerEntity);
		
	}

}
