package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.constant.FoodType;
import com.xworkz.fooddelivery.entiry.FoodIteamEntity;
import com.xworkz.fooddelivery.repository.FoodIteamRepository;
import com.xworkz.fooddelivery.repository.FoodIteamRepositoryImpl;
import com.xworkz.fooddelivery.service.FoodIteamServiceImpl;
import com.xworkz.fooddelivery.service.FoodItemService;

public class FoodItemTester {

	public static void main(String[] args) {
		FoodIteamEntity entity=new FoodIteamEntity("FridRice", 70, FoodType.NORTHINDIAN, 2, 20);
		FoodIteamRepository foodIteamRepository=new FoodIteamRepositoryImpl();
		FoodItemService foodItemService=new FoodIteamServiceImpl(foodIteamRepository);
		foodItemService.validateAndSave(entity);

	}

}
