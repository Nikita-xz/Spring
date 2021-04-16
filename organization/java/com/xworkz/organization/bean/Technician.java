package com.xworkz.organization.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Technician {
	private String name;
	
	@Value("30000")
	private int salary;
	
	public Technician(@Value("Vishalaxi")String name) {
		System.out.println("created"+this.getClass().getSimpleName());
		this.name=name;
	}
	
	public void test() {
		System.out.println("created test");
		System.out.println("invoked"+this.name);
		System.out.println("invoked"+this.salary);
	}
	
	

}
