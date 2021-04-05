package com.xworkz.pg.component;

public class WardenComponent {
	
	private String wardenName;
	
	public WardenComponent() {
		System.out.println("invoked"+this.getClass().getSimpleName());
	}
	
	public void arrangeFood() {
		System.out.println("Created ArrangeFood ");
	}
	
	public void setWardenName(String wardenName) {
		this.wardenName = wardenName;
	}

}
