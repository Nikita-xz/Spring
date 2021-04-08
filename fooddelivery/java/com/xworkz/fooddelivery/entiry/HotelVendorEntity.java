package com.xworkz.fooddelivery.entiry;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


import com.xworkz.fooddelivery.constant.HotelVendorType;

import lombok.Data;
@Entity
@Data
@Table(name="hotelvendor")

public class HotelVendorEntity {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="LOCATION")
	private String location;
	@Column(name="RATING")
	private int rating;
	@Column(name="PHONE_NO")
	private float phoneNo;
	@Column(name="HOTEL_VENDOR_TYPE")
	private HotelVendorType hotelvendortype;

	public HotelVendorEntity(int id, String name, String location, int rating, float phoneNo, HotelVendorType hotelvendortype) {
		super();
		this.id=id;
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.phoneNo = phoneNo;
		this.hotelvendortype = hotelvendortype;
	}

	
	

}
