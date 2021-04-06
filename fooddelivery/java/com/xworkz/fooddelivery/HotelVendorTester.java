package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.constant.HotelVendorType;
import com.xworkz.fooddelivery.entiry.HotelVendorEntity;
import com.xworkz.fooddelivery.repository.HotelVendorRepository;
import com.xworkz.fooddelivery.repository.HotelVendorRepositoryImpl;
import com.xworkz.fooddelivery.service.HotelVendorService;
import com.xworkz.fooddelivery.service.HotelVendorServiceImpl;

public class HotelVendorTester {

	public static void main(String[] args) {

		HotelVendorEntity entity = new HotelVendorEntity("Kavya", "Gadag", 6, 7890675432f, HotelVendorType.WHOLESALERS);
		HotelVendorRepository hotelVendorRepository = new HotelVendorRepositoryImpl();
		HotelVendorService hotelVendorService = new HotelVendorServiceImpl(hotelVendorRepository);
		hotelVendorService.validateAndSave(entity);
	}

}
