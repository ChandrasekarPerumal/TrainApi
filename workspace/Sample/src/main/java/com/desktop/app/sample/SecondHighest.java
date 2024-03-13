/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.desktop.app.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


interface A {

    void show();
}

class Employee {

    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
    }

}

public class SecondHighest {

    public static void findDuplicates(List<Integer> salary) {
        System.out.println(salary.stream()
                .collect(Collectors.groupingBy(i -> i))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList()));
    }

    public static void main(String[] args) {

        List<Integer> salary = Arrays.asList(1, 2, 3, 1, 4, 5, 2);
        findDuplicates(salary);

        List<Employee> emp = new ArrayList<>();

        emp.add(new Employee(2, "Ravi", 22000));
        emp.add(new Employee(3, "Chan", 10000));
        emp.add(new Employee(5, "Praveen", 50000));
        emp.add(new Employee(1, "Kamal", 80000));

//        System.out.println("Second Salary: " + salary.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());
//        System.out.println(emp.stream()
//                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getId).reversed())
//                .skip(1).findFirst());
        Optional<Employee> ops = emp.stream()
                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getId).reversed())
                .skip(1).findFirst();

        Object highestSalary = emp.stream().max(Comparator.comparing(Employee::getSalary)).get().salary;

        System.out.println(ops.get().salary);
        System.out.println("highestSalary:" + highestSalary);

    }

}
