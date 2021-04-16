package com.xworkz.organization.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Components {

	@Value("register")
	private String name;
	private int price;

	public Components(@Value("500") int price) {
		System.out.println("created" + this.getClass().getSimpleName());
		this.price = price;
	}
	
	public void working() {
		System.out.println("invoked working");
		System.out.println("invoked"+this.name);
		System.out.println("invoked"+this.price);
	}

}
