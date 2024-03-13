package com.desktop.app.test2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumOps {

	static int arr[] = { 2, 6, 3, 7, 1, 6, 3, 4, 5, 6, 6, 5, 5, 10 };

	static int ar[] = { 1, 1, 3, 0, 10, 0, 4, 2 };

	static void countNumbers() {

		Map<Integer, Long> mp = Arrays.stream(ar).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		mp.entrySet().stream().filter(i -> i.getValue() >= 2)
				.forEach(K -> System.out.println(K.getKey() + ":" + K.getValue()));

	}

	 static void findMax() {
		int mac = Arrays.stream(ar).max().getAsInt();
		System.out.println("Maxi: "+mac);
	}
	
	static void hashMap() {
		Map<Integer, Integer> s = new HashMap<Integer, Integer>();

		for (int i : arr) {
			if (s.containsKey(i)) {
				s.put(i, s.get(i) + 1);
			} else {
				s.put(i, 1);
			}

		}

		for (Map.Entry e : s.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}

//		s.entrySet().stream().forEach(k->System.out.println(k.getKey()+":"+k.getValue()));
	}

	public static void main(String[] args) {
//		hashMap();
//		countNumbers();
		findMax();
	}

}
