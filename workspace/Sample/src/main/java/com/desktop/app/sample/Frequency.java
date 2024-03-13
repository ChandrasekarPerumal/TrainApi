package com.desktop.app.sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Frequency {

	static List<Integer> a = Arrays.asList(2, 1, 2, 3, 37, 44, 5, 3, 8, 1, 9, 3, 2);

	static void findFrequency() {
		Map<Integer, Long> fr = a.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Prints the count
		fr.entrySet().forEach(k -> System.out.println(k.getKey() + " " + k.getValue()));

		System.out.println("****************************");

		// Print only frequency greater than 2
		fr.entrySet().stream().filter(i -> i.getValue() > 1)
				.forEach(k -> System.out.println(k.getKey() + " " + k.getValue()));
	}

	static void display() {
		a.stream().distinct().forEach(System.out::println);
	}

	static void evenNumbers() {
		long s = a.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println(s);
	}

	static void unique() {
		Set<Integer> set = new HashSet<>();
		a.stream().filter(ele -> !set.add(ele)).collect(Collectors.toSet());
//		set.forEach(System.out::println);

		// or

		a.stream().distinct().forEach(System.out::println);

	}

	static void sumOfIntegers() {
		int s = a.stream().mapToInt(i -> i).sum();

		System.out.println(s);
	}

	static void allAreDivisibleBy3() {
		boolean t = a.stream().allMatch(i -> i % 3 == 0);
		System.out.println(t);
	}

	static void otherConsumerPeek() {
		a.stream().peek(System.out::println).count();
	}

	static void forEachMethod() {
		a.stream().forEach(i -> System.out.print(i + " "));
		System.out.println("\n");
		a.stream().forEachOrdered(i -> System.out.print(i + " "));
	}

	public static void main(String[] args) {
//		findFrequency();
//		display();

//		evenNumbers();

//		unique();

//		sumOfIntegers();
//		allAreDivisibleBy3();
//		otherConsumerPeek();

//		forEachMethod();

		strOps();
//		geek();
	}

	static void strOps() {
		List<String> s = List.of("Arrays", "Chan", "Read","Chan", "Writing");

//		s.stream()
//		.flatMapToInt(str -> IntStream.of(str.length()))
//		.forEach(System.out::println);
		
		Map<String ,Long> co = s.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		co.entrySet()
		.stream().filter(i->i.getValue()>1)
		.forEach(i->System.out.println(i.getKey()+" : "+i.getValue()));
		
//		s.stream().limit(2).forEach(System.out::print);

	}

	static void geek() {
		Stream<String> stream 
		= Stream.of("CSE", "C++", "Java", "DS"); 

	// Now using Stream noneMatch(Predicate predicate) 
	// and later storing the boolean answer as 
	boolean answer 
		= stream.noneMatch(str -> (str.length() == 4)); 

	// Printing the boolean value on the console 
	System.out.println(answer); 
	}
	
}
