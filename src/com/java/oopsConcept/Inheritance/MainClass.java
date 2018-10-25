package com.java.oopsConcept.Inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check 1");
		check1();
		System.out.println("Check 2");
		check2();
	}

	/*
	 * this method is used to check the type-cast of parent object to child
	 * and also to check which of the variable value will be print in this case 
	 */
	public static void check1() {
		ChildClass childClass =(ChildClass) new ParentClass();
		System.out.println("counter is "+childClass.counter);
		childClass.print();
	}
	
	/*
	 * this method is to check if child object can be assigned to parent reference
	 * and which method will be called in this case 
	 */
	public static void check2() {
		ParentClass parentClass = new ChildClass();
		System.out.println("counter is "+parentClass.counter);
		parentClass.print();
		
		ChildClass childClass = new ChildClass();
		System.out.println("counter for child class is "+childClass.counter);
		childClass.print();
	}
}
