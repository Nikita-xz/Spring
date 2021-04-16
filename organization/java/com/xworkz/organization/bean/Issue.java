package com.xworkz.organization.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Issue {
	private String name;
	@Value("5")
	private int noOfIssues;

	public Issue(@Value("exception") String name) {
		System.out.println("created" + this.getClass().getSimpleName());
		this.name = name;
	}

	public void solving() {
		System.out.println("invoked solving");
		System.out.println("nvoked" + this.name);
		System.out.println("invoked" + this.noOfIssues);
	}

}
