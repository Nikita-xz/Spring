package com.xworkz.organization.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Hospital {
	
	@Value("ESI")
	private String name;
	@Autowired
	private XrayMachine machine;
	
	public Hospital() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	public void admit() {
		System.out.println("created admit");
		System.out.println("name "+this.name);
		this.machine.test();
	}

}
