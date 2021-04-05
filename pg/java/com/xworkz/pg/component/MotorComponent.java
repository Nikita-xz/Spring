package com.xworkz.pg.component;

public class MotorComponent {
	
	private int warrantyPeriod;
	
	public MotorComponent() {
     System.out.println("invoked"+this.getClass().getSimpleName());

	}
	
	public void rotate() {
		System.out.println("motor rotating");
	}
	
	public void setWarrantyPeriod(int warrantyPeriod) {
		System.out.println("invoked setWarrantyPeriod"+warrantyPeriod);
		this.warrantyPeriod = warrantyPeriod;
	}

}
