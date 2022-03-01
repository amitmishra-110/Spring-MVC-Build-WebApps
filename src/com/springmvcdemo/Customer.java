package com.springmvcdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Controller;

//Form Validation using Hibernate API (validators)


public class Customer {
	
	private String firstName;
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	//Number range validation & make free passess mandatory
	@NotNull(message="is Required")
	@Min(value=0,message="greater than 0")
	@Max(value=10,message="less than 10")
	private Integer freePasses;
	
	//Reqular Expression validation
	@Pattern(regexp="[a-zA-Z0-9]{5}",message="only 5 characters acceptble for Postal Code")
	private String postalCode;
	
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
