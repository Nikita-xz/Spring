package com.xworkz.organization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.organization.bean.Organization;

public class OrganizationTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml");
		Organization org=container.getBean(Organization.class);
		org.displayAll("omkar");

	}

}
