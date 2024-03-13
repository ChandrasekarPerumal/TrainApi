package com.learn.java7.features;


/*
 * Before variable length argument
 * 1.Method overloading was used.
 * 2.Array argument was used.
 * 
 * - Maintaining of array argument was a problem
 * 
 * Syntax : returnType methodName(dataType... variableName){--}
 * 
 * */

public class VaraibleLengthArgument {
	
	public void lastName(String... lastName) {
		for(String s: lastName) {
			System.out.println(s);
		}
	}

}
