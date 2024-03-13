package com.desktop.app.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.desktop.app.e.Employee;

public class Test {

	static List<String> longest(List<String> str, int n) {
		Map<String,Integer> strFre= new HashMap<>();		
		for(int i=0;i<str.size();i++) {
			strFre.put(str.get(i), str.get(i).length());
			
		}
		return null;
	}

	public static void main(String[] args) {
		// list – Yuri, Ron, Interview, Longest, List, Contain

		List<String> str = List.of("Yuri", "Ron", "Interview", "Longest", "List", "Contain");

//		longest(str, 1);
		hashSetMethod(); 

	}
	
	
	static void hashSetMethod() {
		Set s = new HashSet<>();
		Employee employee = new Employee("chan");
		s.add(new Employee("chan"));
		s.add(new Employee("chan"));
		
		s.stream().forEach(System.out::println);
		
		
	}
	

}
