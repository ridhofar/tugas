package com.javaprogram;

public class class1 {

	String name;
	public class1(String name, String address, int numberId) {
		super();
		this.name = name;
		this.address = address;
		this.numberId = numberId;
	}
	String address;
	int numberId ;
	
	public int getNumberId() {
		return numberId;
	}
	public void setNumberId(int numberId) {
		this.numberId = numberId;
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
}
