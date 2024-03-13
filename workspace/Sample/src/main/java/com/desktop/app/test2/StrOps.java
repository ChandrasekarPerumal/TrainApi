package com.desktop.app.test2;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StrOps {

	
	static String str ="Chandrasekar Got placed";
	
	public static void reverse() {
		char[] ch = str.toCharArray();
		
		IntStream.range(0,ch.length)
		.map(i->ch.length-i-1)
		.mapToObj(i->ch[i])
		.forEach(i->System.out.print(i));
	
	
	}
	
	
	public static void splitStr() {
		Stream<String> s = Stream.of(str.split(" "));
		s.forEach(System.out::println);
	}
	
	
	public static void countChar() {
		
		
		Map<String, Long> ch = Arrays.stream(str.split(""))
				.filter(i-> !i.equals(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
				
		
		System.out.println(ch);
	}
	
	public static void main(String[] args) {
//		reverse();
//		splitStr();
		countChar();
	}
	
	
}
