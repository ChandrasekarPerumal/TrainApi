package com.learn.java8.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEach {
	
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,5,4,56,77);
		
		// External For loop
		for (int j = 0; j < values.size(); j++) {
			System.out.println(values.get(j));
		}
		
		for (Integer integer : values) {
			System.out.println(integer);
		}
		
		// Internal for loop in Java 8
		values.forEach(i -> System.out.println(i));
	}

}
