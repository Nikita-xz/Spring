package com.xworkz.fooddelivery.entiry;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;

import com.xworkz.fooddelivery.constant.FoodType;

import lombok.Data;
import lombok.NonNull;
@Entity
@Data
@Table(name="fooddeliver")

public class FoodIteamEntity {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	@NonNull
	private String name;
	@Column(name="PRICE")
	@NonNull
	private int price;
	@NonNull
	@Column(name="FOOD_TYPE")
	private FoodType foodtype;
	@Column(name="QUANTITY")
	@NonNull
	private int quantity;
	@Column(name="DISCOUNT")
	@NonNull
	private int discount;
	
	public FoodIteamEntity() {
		System.out.println("invoked FoodIteamEntity");
	}

	public FoodIteamEntity(int id,String name, int price, FoodType foodtype, int quantity, int discount) {
		super();
		this.id=id;
		this.name = name;
		this.price = price;
		this.foodtype = foodtype;
		this.quantity = quantity;
		this.discount = discount;
	}

	
	

}
