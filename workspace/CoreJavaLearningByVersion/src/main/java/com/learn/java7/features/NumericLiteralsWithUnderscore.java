package com.learn.java7.features;



/* Underscore is used to code readability
 * 12_ compilation error
 * _12 is treated as identifier but not a numeric literal
 * 
 */
public class NumericLiteralsWithUnderscore {

	
	public void numericUnderscore() {
		try {
			long intValue = 10_000001_22;
			System.out.println(intValue);

		}catch (Exception e) {
			e.printStackTrace();
		}
			}
	
}
