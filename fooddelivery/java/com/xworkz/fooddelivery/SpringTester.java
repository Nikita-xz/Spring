package com.xworkz.fooddelivery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooddelivery.constant.FoodType;
import com.xworkz.fooddelivery.constant.HotelVendorType;
import com.xworkz.fooddelivery.entiry.CustomerEntity;
import com.xworkz.fooddelivery.entiry.FoodIteamEntity;
import com.xworkz.fooddelivery.entiry.HotelVendorEntity;
import com.xworkz.fooddelivery.service.CustomerService;
import com.xworkz.fooddelivery.service.FoodItemService;
import com.xworkz.fooddelivery.service.HotelVendorService;

public class SpringTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml");
		FoodItemService service=container.getBean(FoodItemService.class);
		FoodIteamEntity entity=new FoodIteamEntity("Dosa", 40, FoodType.NORTHINDIAN, 02, 20);
		service.validateAndSave(entity);
		
		CustomerService customer=container.getBean(CustomerService.class);
		CustomerEntity entity1=new CustomerEntity("Anita", "Bangalore", 5, 7890675432f, "anita.xworkz@gmail.com", "female");
		customer.validateAndSave(entity1);
		
		HotelVendorService vendor=container.getBean(HotelVendorService.class);
		HotelVendorEntity hotel=new HotelVendorEntity("Trupti", "Bagalkot", 6, 8906543219f,HotelVendorType.RETAILERS);
		vendor.validateAndSave(hotel);

	}

}
