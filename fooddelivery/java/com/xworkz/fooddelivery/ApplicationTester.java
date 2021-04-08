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

public class ApplicationTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml");
		/*FoodItemService food=container.getBean(FoodItemService.class);
		FoodIteamEntity entity=new FoodIteamEntity(1, "Masal Dosa", 40, FoodType.NORTHINDIAN, 5, 20);
		food.validateAndSave(entity);*/
		
		CustomerService customer=container.getBean(CustomerService.class);
		CustomerEntity entity=new CustomerEntity(1, "Trupti", "Bangalore", 2, 7890987654f, "trupti.123@gmail.com", "female");
		customer.validateAndSave(entity);
		
		/*HotelVendorService hotel=container.getBean(HotelVendorService.class);
		HotelVendorEntity entity= new HotelVendorEntity(1, "Nikita", "Dharwad", 5, 8050172934f, HotelVendorType.RETAILERS);
		hotel.validateAndSave(entity);*/

	}

}
