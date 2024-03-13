package com.learn.java8.interfaces;

public class ClassE extends ClassA implements LearnInterface  {

	@Override
	public void gear() {

		System.err.println("Showing GEAR");
	}

	@Override
	public void show() {
	System.out.println("ClassE.show()");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ClassE classE=new ClassE();
		classE.show();
		classE.gear();
		
		LearnInterface.displayStatic();

	}

}
