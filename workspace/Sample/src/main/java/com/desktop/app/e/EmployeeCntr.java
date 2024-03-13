package com.desktop.app.e;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class EmployeeCntr {

	static void combine() {
		List<Employee> emp1 = new ArrayList<>();
		List<Employee> emp2 = new ArrayList<>();
		
		emp1.add(new Employee(2, "Ravi", 22000));
		emp1.add(new Employee(3, "Chan", 10000));
		emp1.add(new Employee(5, "Praveen", 50000));
		emp1.add(new Employee(1, "Kamal", 80000));
		
		emp2.add(new Employee(2, "Ravi", 22000));
		emp2.add(new Employee(3, "Chan", 10000));
		emp2.add(new Employee(5, "Praveen", 50000));
		emp2.add(new Employee(1, "Kamal", 80000));
		
		List<Employee> comb =  Stream.concat(emp1.stream(),emp2.stream())
				.sorted(Comparator.comparingInt(Employee::getSalary)).toList();
		
		List<Employee> comb1 =  Stream.concat(emp1.stream(),emp2.stream())
				.toList();
		
		
//		comb1.forEach(System.out::println);
		
		
		
		System.out.println(comb1
				.stream()
				.sorted(Comparator. comparing(Employee::getSalary).reversed())
				.skip(1).findFirst().get());
	}
	
	static void findByLetter() {
		List<Employee> emp = new ArrayList<>();

		emp.add(new Employee(2, "Ravi", 22000));
		emp.add(new Employee(3, "Chan", 10000));
		emp.add(new Employee(5, "Praveen", 50000));
		emp.add(new Employee(1, "Kamal", 80000));

		Optional<Employee> s= emp.stream()
				.filter(i->i.getName().startsWith("P"))
				.filter(i->i.getSalary()>60000)
				.findAny();
		
		s.ifPresentOrElse( (i)->System.out.println(i.getName()),()-> System.out.println("cd"));
		
		
	}

	
	
	static void filterByGender() {
		List<Employee> emp = new ArrayList<>();

		emp.add(new Employee(2, "Ravi", 22000,"M"));
		emp.add(new Employee(3, "Chan", 10000,"F"));
		emp.add(new Employee(5, "Praveen", 50000,"M"));
		emp.add(new Employee(1, "Kamal", 80000,"F"));
		
		List<Employee> s= emp.stream()
				.filter(i->i.getName().startsWith("P"))
				.filter(j-> j.getGender().equals("F"))
				.toList();
		
		s.forEach(System.out::println);
	}
	public static void main(String[] args) {
//		findByLetter();
		combine();
		
		Random random= new Random();
		int N = random.nextInt(10);
//		System.out.println(N);
		
//		filterByGender();
	}
	
}
