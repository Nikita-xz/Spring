package com.xworkz.fooddelivery.repository;

import com.xworkz.fooddelivery.entiry.FoodIteamEntity;

public class FoodIteamRepositoryImpl implements FoodIteamRepository {

	@Override
	public void save(FoodIteamEntity entity) {
		System.out.println("invoked save"+entity);
		
		
	}

}
