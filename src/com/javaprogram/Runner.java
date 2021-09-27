package com.javaprogram;

public class Runner {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		class1 Class1 =  new class1("Varane","Manchester United",1);
		System.out.println(Class1.getName());
		
		Class1.setName("Ridho");
		System.out.println(Class1.getName());
		
		Class1.setNumberId(10);
		System.out.println(Class1.getNumberId());
		
		Class1.setAddress("Jakarta Pusat");
		System.out.println(Class1.getAddress());
		
		Child child = new Child();
		System.out.println(child.getParentsName());
		child.printMessage();
		
		Implementer implementer  = new Implementer();
		implementer .test1();
		implementer.test2();
		
		MyModifiedClass myModifiedClass = new MyModifiedClass();
		myModifiedClass.shareMessage();

		// MyAbstractClass myAbstractClass = new MyAbstractClass();
		Utility.hardWait(5);
		System.out.println("this is deleyed");
	}

}
