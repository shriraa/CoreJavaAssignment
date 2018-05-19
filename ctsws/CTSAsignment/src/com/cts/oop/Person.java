package com.cts.oop;

public class Person {
	
	private String name;
    private String address;
    private String mobile;
    
    public Person()
	{
		System.out.println("Calling Super class constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
