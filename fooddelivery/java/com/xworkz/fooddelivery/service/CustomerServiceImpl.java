package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.entiry.CustomerEntity;
import com.xworkz.fooddelivery.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("created" + this.getClass().getSimpleName());
		this.customerRepository=customerRepository;

	}

	@Override
	public boolean validateAndSave(CustomerEntity entity) {
		System.out.println("invoked validateAndSave" + entity);
		if (entity != null) {
			System.out.println("entity is valid");
			customerRepository.save(entity);
		} else {
			System.out.println("entity is invalid");
		}
		return false;
	}

}
