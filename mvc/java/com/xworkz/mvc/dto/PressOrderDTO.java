package com.xworkz.mvc.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class PressOrderDTO {
	
	private String orderFrom;
	private long phoneNo;
	private String cardType;
	private int noOfCopies;
	private String content;

}
