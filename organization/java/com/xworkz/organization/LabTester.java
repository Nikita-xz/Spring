package com.xworkz.organization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.organization.bean.IotProject;
import com.xworkz.organization.bean.Lab;
import com.xworkz.organization.bean.Program;

public class LabTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml");
		//Lab lab=container.getBean(Lab.class);
		//lab.result();
		
		//IotProject iot=container.getBean(IotProject.class);
		//iot.run();
		
		Program pgm=container.getBean(Program.class);
		pgm.code();

	}

}
