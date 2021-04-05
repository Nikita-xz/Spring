package com.xworkz.pg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.pg.component.MotorComponent;
import com.xworkz.pg.component.WashingMachine;

public class WashingMachineTester {

	public static void main(String[] args) {
		ApplicationContext spring= new ClassPathXmlApplicationContext("washingmachine.xml");
        WashingMachine wash= spring.getBean(WashingMachine.class);
        wash.wash();
	}

}
