package com.javaprogram;

public class Child extends Parent {
	public String getParentsName() {
		setParentName("Yurniwati");
		return getParentName();
	}

	@Deprecated
	public void printMessage() {
		System.out.println("This Message is from Child Class");
	}

}
