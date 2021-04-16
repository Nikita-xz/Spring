package com.xworkz.organization.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Program {
	
	@Value("5")
	private int noOfFields;
	@Autowired
	private Issue issue;
	
	public Program() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	public void code() {
		System.out.println("created code");
		this.issue.solving();
	}

}
