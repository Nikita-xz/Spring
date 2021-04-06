package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.entiry.CustomerEntity;
import com.xworkz.fooddelivery.repository.CustomerRepository;
import com.xworkz.fooddelivery.repository.CustomerRepositoryImpl;
import com.xworkz.fooddelivery.service.CustomerService;
import com.xworkz.fooddelivery.service.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {

		CustomerEntity entity = new CustomerEntity("nikita", "Rajajinagar Bangalore", 5, 8050172934f,
				"nikita.xworkz@gmail.com", "female");
		CustomerRepository customerRepository = new CustomerRepositoryImpl();
		CustomerService customer = new CustomerServiceImpl(customerRepository);
		customer.validateAndSave(entity);

	}

}
