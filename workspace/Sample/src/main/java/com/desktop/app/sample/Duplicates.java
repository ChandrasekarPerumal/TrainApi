/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.desktop.app.sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author mglocadmin
 */
public class Duplicates {

	static List<Integer> dup = Arrays.asList(1, 23, 4, 5, 6, 1, 2, 3, 2, 4);

	static List<String> str = Arrays.asList("Chan", "Chandra", "June", "June", "Chan", "June");

	static void number() {
		int count = dup.stream().mapToInt(Integer::intValue).sum();
//		System.out.println(count);

		List<Integer> sec = dup.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		Optional<Integer> sec2 = dup.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

		sec.forEach(i -> System.out.print(" " + i + " "));

		sec2.ifPresent(System.out::println);
	}

	public static void duplicates() {

		Set<Integer> set = new HashSet<>();
		Set<Integer> set2 = dup.stream().filter(ele -> !set.add(ele)).collect(Collectors.toSet());
		set2.forEach(System.out::println);
		// print only the duplicates - filter(ele-> !set.add(ele))
		// print without duplicates - filter(ele-> set.add(ele))
	}

	public static void repeatation1() {
		Map<Integer, Long> freq = dup.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		freq.forEach((i, j) -> System.out.println(i + " " + j));
	}

	public static void onlyRepeating() {
		Map<Integer, Long> freq = dup.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		freq.entrySet().stream().filter(i -> i.getValue() == 1)
				.forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));

		System.out.println("***********************************");

		freq.entrySet().stream().filter(i -> i.getValue() > 1)
				.forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));

	}

	static void seperate() {
		System.out.println(dup.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0)));
	}

	public static void main(String[] args) {
//		repeatation1();
//		onlyRepeating();
		strDuplicates();

//		seperate();
//		charFreq();
	}

	static void strDuplicates() {

		Map<String, Long> dup = str.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));

		dup.entrySet().stream().filter(i -> i.getValue() > 1)
				.forEach(kk -> System.out.println(kk.getKey() + " : " + kk.getValue()));

	}

	static void charFreq() {
		String rev = "Reversing the String in";

		char[] ch = rev.toCharArray();
		
		IntStream.range(0, ch.length)
		.map(i->ch.length-1-i)
		.mapToObj(i->ch[i])
		.forEach((i)->System.out.print(i));


	}

}
