package com.learn.java7.features;


/*
 * The integral types (byte, short, int, and long) can also be expressed using the binary number system. 
 * To specify a binary literal, add the prefix 0b or 0B to the number.
 */


public class BinaryLiterals {
	
	public void binaryToWholeValue() {
		try {
		int intValue=0b01;
		byte byteValue = 0b011;
		long longValue = -0B01;
		System.out.println(intValue + " "+ byteValue + " "+ longValue);}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
