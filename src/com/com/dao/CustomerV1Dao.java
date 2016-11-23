package com.com.dao;

import com.com.entities.CustomerEntity;

public interface CustomerV1Dao {
	
	public void addCustomer(CustomerEntity entity);
	
	public CustomerEntity get(String id);
	
	public void update(CustomerEntity entity);
	
	public void delete(CustomerEntity entity);

}
