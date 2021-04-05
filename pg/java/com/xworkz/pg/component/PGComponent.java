package com.xworkz.pg.component;

public class PGComponent {
	private String ownerName;
	private WardenComponent warden;
	
	public PGComponent() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	public void serveFood() {
		System.out.println("invoked serveFood");
		this.warden.arrangeFood();
	}
	
	public void setOwnerName(String ownerName) {
		System.out.println("invoked setOwnerName"+ownerName);
		this.ownerName = ownerName;
	}
	
	public void setWarden(WardenComponent warden) {
		System.out.println("invoked setWarden"+warden);
		this.warden = warden;
	}

}
