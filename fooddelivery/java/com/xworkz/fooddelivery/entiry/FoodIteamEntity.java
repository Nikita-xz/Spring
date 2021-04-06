package com.xworkz.fooddelivery.entiry;

import com.xworkz.fooddelivery.constant.FoodType;

public class FoodIteamEntity {
	private String name;
	private int price;
	private FoodType foodtype;
	private int quantity;
	private int discount;
	
	public FoodIteamEntity() {
		System.out.println("invoked FoodIteamEntity");
	}

	@Override
	public String toString() {
		return "FoodIteamEntity [name=" + name + ", price=" + price + ", foodtype=" + foodtype + ", quantity="
				+ quantity + ", discount=" + discount + "]";
	}

	public FoodIteamEntity(String name, int price, FoodType foodtype, int quantity, int discount) {
		super();
		this.name = name;
		this.price = price;
		this.foodtype = foodtype;
		this.quantity = quantity;
		this.discount = discount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + discount;
		result = prime * result + ((foodtype == null) ? 0 : foodtype.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodIteamEntity other = (FoodIteamEntity) obj;
		if (discount != other.discount)
			return false;
		if (foodtype != other.foodtype)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public FoodType getFoodtype() {
		return foodtype;
	}

	public void setFoodtype(FoodType foodtype) {
		this.foodtype = foodtype;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	

}
