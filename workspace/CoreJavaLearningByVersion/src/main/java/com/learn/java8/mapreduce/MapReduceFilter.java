/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.java8.mapreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author mglocadmin
 */
public class MapReduceFilter {

    public static void mapReduce() {
        List<Integer> listOfInt = Arrays.asList(3, 7, 13, 4, 0, 5);
        int regularForLoop = 0;
        for (int i : listOfInt) {
            regularForLoop += i;

        }

        System.out.println("Print - raditional :" + regularForLoop);

        // Sum is a reduce method
        // reduce(0, (a,b) ->a+b) - actually happens inside
        int s1 = listOfInt.stream().mapToInt(Integer::intValue).sum();

        // Both are same mapToInt( get the stream value mapping to int )
        int s2 = listOfInt.stream().mapToInt(i -> i).sum();
        System.out.println(s1);
        System.out.println(s2);

        // Still more code is reduced 
        int reduceSum = listOfInt.stream().reduce(0, (a, b) -> a + b);

        System.out.println("Reduce : " + reduceSum);

        Optional<Integer> sum = listOfInt.stream().reduce(Integer::sum);

        System.out.println(sum.get());

    }

    public static void reduceMap_tried() {
        List<Integer> listOfInt = Arrays.asList(3, 7, 13, 4, 5);

        // Multiplication
        int mul = listOfInt.stream().reduce(1, (i, j) -> i * j);

        System.out.println("Multiplication :" + mul);

        // Find max : way1
        int max1 = listOfInt.stream().reduce(0, (a, b) -> a > b ? a : b);
        int methodReferenceMax = listOfInt.stream().reduce(Integer::max).get();
        System.out.println("Find - Max :" + max1);

        System.out.println("methodReferenceMax :" + methodReferenceMax);

    }

    public static void stringReduce() {
        List<String> stringList = Arrays.asList("corejava", "German", "Chan");

        String longestString = stringList.stream().reduce((a, b) -> a.length() > b.length() ? a : b).get();
        System.out.println("Long String :" + longestString);

    }

    public static List<Employee> getEmployee() {
        return Stream
                .of(
                        new Employee("Chandra", "A", 120000),
                        new Employee("John", "A", 10000),
                        new Employee("Mano", "A", 22330))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

//        mapReduce();
//        reduceMap_tried();
        stringReduce();

        // All the three employee has grade 'A' and need to get AVERAGE of it
        System.out.println("Average : "+getEmployee().stream()
                .filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(emp -> emp.getSalary())
                .mapToInt(i -> i)
                .average()
                .getAsDouble());

        // All the three employee has grade 'A' and need to get SUM of it
        System.out.println( " SUM :"+ getEmployee().stream()
                .filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(emp -> emp.getSalary())
                .mapToInt(i -> i)
                .sum());

    }

}
