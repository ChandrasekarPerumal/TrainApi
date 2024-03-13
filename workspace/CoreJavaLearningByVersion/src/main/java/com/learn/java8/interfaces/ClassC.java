package com.learn.java8.interfaces;

public class ClassC extends ClassA{

//	public void show() {
//		System.out.println("Display C");
//	}
//	
	
//	ClassA & ClassC contains same methodName
//	Change the visibility of ClassC or else conflict error will come.
	
	
	
	public static void main(String []args) {
		ClassC classC=new ClassC();
		
		classC.show();
	}
}
