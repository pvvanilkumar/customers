package com.com.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.com.dao.CustomerV1Dao;
import com.com.entities.CustomerEntity;

@Repository
@Transactional(rollbackFor = Throwable.class)
public class CustomerV1DaoImpl implements CustomerV1Dao {

	@Resource
	SessionFactory sessionFactory;
	
	@Override
	public void addCustomer(CustomerEntity entity) {
		if(entity != null)
		{
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(entity);
		}
	}

	@Override
	public CustomerEntity get(String id) {
		
		return null;
	}

	@Override
	public void update(CustomerEntity entity) {
		

	}

	@Override
	public void delete(CustomerEntity entity) {
		

	}

}
