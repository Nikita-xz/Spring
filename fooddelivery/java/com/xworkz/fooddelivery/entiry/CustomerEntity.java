package com.xworkz.fooddelivery.entiry;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;

@Entity
@Data
@Table(name="customer")

public class CustomerEntity {
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
	@Column(name="EMAIL")
	private String email;
	@Column(name="GENDER")
	private String gender;

	public CustomerEntity(int id,String name, String location, int rating, float phoneNo, String email, String gender) {
		super();
		this.id=id;
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.phoneNo = phoneNo;
		this.email = email;
		this.gender = gender;
	}

	

}
