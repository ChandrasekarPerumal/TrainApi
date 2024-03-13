package com.learn.java8.optional;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalFeature {
	
	
	public static void main(String [] ar) {
		
		Optional<String> a = Optional.of("Chan java Hibernate");
		
		a.ifPresent(value ->{
			System.out.println(value);
		});
		
	}

}
