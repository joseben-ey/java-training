package com.ey.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class Validator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Boolean isValidAdhhar(Long adharCard){
		String longadhaar = String.valueOf(adharCard);
		String regex = "\\d{12}";
		if (longadhaar.matches(regex))
			return true;
		else
			return false;
		
	}

	public static boolean isValidName(String name) {
		return name.matches("[a-zA-Z]+");
	}
	
	public static boolean isValidBirthdate(LocalDate localDate)
	{
		LocalDate currentDate = LocalDate.now();
		Period period = Period.between(localDate, currentDate);
		return period.getDays()	>0 ;
		}
	
	public Boolean isValidEmail(String email) {
		
		String regexPattern = "^(.+)@(\\S+)$";
		return Pattern.compile(regexPattern).matcher(email).matches();
	}
	
	public Boolean isValidMobile(Long mobile) {

		String longmob = String.valueOf(mobile);
		String regex = "\\d{10}";
		if (longmob.matches(regex))
			return true;
		else
			return false;
	}
}
