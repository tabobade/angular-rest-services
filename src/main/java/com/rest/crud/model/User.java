package com.rest.crud.model;

import java.util.Arrays;

public class User {


	private String fname;
	private	String lname;
	private	String gender;
	private	String[] hobbies;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", hobbies="
				+ Arrays.toString(hobbies) + "]";
	}
	
	
	
	
}
