package com.xworkz.pg.component;

public class WashingMachine {
	private String companyName;
	private float capacity;
	private MotorComponent motor;
	private PowerComponent pow;

	public WashingMachine() {

		System.out.println("invoked" + this.getClass().getSimpleName());
	}

	public void wash() {
		if (pow.isOn()) {
			System.out.println("power is on");
			this.motor.rotate();
		}

	}

	public void setCompanyName(String companyName) {
		System.out.println("invoked setCompanyName"+companyName);
		this.companyName = companyName;
	}

	public void setCapacity(float capacity) {
		System.out.println("invoked setCapacity"+capacity);
		this.capacity = capacity;
	}

	public void setMotor(MotorComponent motor) {
		System.out.println("invoked setMotor"+motor);
		this.motor = motor;
	}

	public void setPow(PowerComponent pow) {
		System.out.println("invoked setPow"+pow);
		this.pow = pow;
	}

}
