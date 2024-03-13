package com.learn.java8.interfaces;

public interface LearnInterface {

 default void show() {
	 
 }
 
 static void displayStatic() {
	 System.out.println("LearnInterface.displayStatic()");
 }
 
 void gear();
	
	
}
