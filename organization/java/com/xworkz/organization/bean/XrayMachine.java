package com.xworkz.organization.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class XrayMachine {
	private String parts;
	
	@Value("25000")
	private int price;
	
	
	public XrayMachine(@Value("body scanner") String parts) {
	System.out.println("invoked"+this.getClass().getSimpleName());
	this.parts=parts;

	}
	
	public void test() {
		System.out.println("invoked test");
		System.out.println("invoked"+this.parts);
		System.out.println("invoked"+this.price);
	}

}
