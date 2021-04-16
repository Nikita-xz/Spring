package com.xworkz.organization.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Lab {
	
	@Value("negative")
	private String report;
	@Autowired
	private Technician technician;
	
	public Lab() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	public void result() {
		System.out.println("created result");
		System.out.println("report"+this.report);
		this.technician.test();
	}

}
