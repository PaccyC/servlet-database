package com.servlet.register;

public class Member {

	public String name,mobile,city,dob;

	public Member() {
		super();
	}
	
	
	public Member(String name, String mobile, String city, String dob) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.city = city;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
