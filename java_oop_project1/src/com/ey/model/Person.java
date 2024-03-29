package com.ey.model;

import java.time.LocalDate;

public class Person {
	
	Long adharCard;  
	String  name;  
	LocalDate  birthdate; 
	String address; 
	String email ; 
	Long mobile;
	private static String colonyName;
	
	static {
			// TODO Auto-generated method stub
		 colonyName = "Sapient Colony";
		}
	public Person()
	{
		
	}
	public Person(Long adharCard) {
		super();
		this.adharCard = adharCard;
	}

	public Person(Long adharCard, String name, LocalDate birthdate, String address, String email, Long mobile) {
		super();
		this.adharCard = adharCard;
		this.name = name;
		this.birthdate = birthdate;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
	}

	public Long getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(Long adharCard) {
		this.adharCard = adharCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public static String getColonyName() {
		return colonyName;
	}

	public static void setColonyName(String colonyName) {
		Person.colonyName = colonyName;
	}
	public int getAge() {
		return LocalDate.now().getYear() - birthdate.getYear();
		}

	@Override
	public String toString() {
		return "Person [adharCard=" + adharCard + ", name=" + name + ", birthdate=" + birthdate + ", address=" + address
				+ ", email=" + email + ", mobile=" + mobile + "]";
	}

	

}
