package com.xworkz.pg.component;

public class PowerComponent {

	private boolean on;

	public PowerComponent() {

		System.out.println("invoked" + this.getClass().getSimpleName());
	}
	
	public boolean isOn() {
		return on;
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
}
