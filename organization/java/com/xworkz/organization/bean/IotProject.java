package com.xworkz.organization.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class IotProject {
	
	@Value("landmine detection robotics")
private String name;
	
	@Autowired
private Components components;
	
	public IotProject() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	public void run() {
		System.out.println("creayed run");
		this.components.working();
	}

}
