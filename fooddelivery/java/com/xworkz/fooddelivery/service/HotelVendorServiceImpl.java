package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.entiry.HotelVendorEntity;
import com.xworkz.fooddelivery.repository.HotelVendorRepository;

public class HotelVendorServiceImpl implements HotelVendorService {
	private HotelVendorRepository vendorRepository;

	public HotelVendorServiceImpl(HotelVendorRepository vendorRepository) {
		System.out.println("created" + this.getClass().getSimpleName());
		this.vendorRepository = vendorRepository;
	}

	@Override
	public boolean validateAndSave(HotelVendorEntity entity) {

		System.out.println("invoked validateAndSave" + entity);
		if (entity != null) {
			System.out.println("entity is valid");
			vendorRepository.save(entity);
		} else {
			System.out.println("entity is invalid");
		}
		return false;
	}

}
