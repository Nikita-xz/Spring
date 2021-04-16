package com.xworkz.organization.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Organization {
	private String name;
	private String location;
	
	@Value("Omkar")
	private String founder;
	
	public Organization(@Value("Xworkz")String name) {
		System.out.println("invoked organization");
		this.name=name;
		System.out.println(name);
	}
	
	public void displayAll(String founder) {
		System.out.println("invoked displayAll");
		this.founder=founder;
		System.out.println(founder);
	}
	
	@Value("Rajajinagar Bangalore")
	public void setLocation(String location) {
		this.location = location;
		System.out.println(location);
	}

}
