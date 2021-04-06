package com.xworkz.fooddelivery.repository;

import com.xworkz.fooddelivery.entiry.HotelVendorEntity;

public class HotelVendorRepositoryImpl implements HotelVendorRepository {

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("invoked save"+entity);
	}

}
