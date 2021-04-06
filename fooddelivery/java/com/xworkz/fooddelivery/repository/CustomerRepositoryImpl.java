package com.xworkz.fooddelivery.repository;

import com.xworkz.fooddelivery.entiry.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository {

	@Override
	public void save(CustomerEntity entity) {
		System.out.println("invoked save" + entity);

	}

}
