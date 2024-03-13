/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.java8.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author mglocadmin
 */
public class Task {

    public static void evenNumbers() {

        List<Integer> l = Arrays.asList(1, 12, 3, 4, 15, 16, 7, 8);

        l.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

    }

    public static void print1() {
        List<Integer> l = Arrays.asList(1, 12, 3, 4, 15, 16, 7, 8);
        l.stream().map(s -> s.toString()).filter(s -> s.startsWith("1")).forEach(System.out::println);
    }

    public static void duplicates() {
        List<Integer> l = Arrays.asList(12, 12, 3, 4, 15, 16, 16, 8);

        HashSet<Integer> hashSet = new HashSet();

        l.stream().filter(s -> !hashSet.add(s)).forEach(System.out::println);

        Long s = l.stream().distinct().count();
        
        List<Integer> o = l.stream().distinct().collect(Collectors.toList());

        int i = o.stream().mapToInt(j->j).sum();
        
        int maxi = o.stream().reduce(Integer::max).get();
        
        System.out.println("ANSWER : " +maxi  );
    }

    public static void countValues() {
        List<Integer> l = Arrays.asList(12, 12, 3, 4, 15, 16, 16, 8);

        long val = l.stream().count();

        System.out.println(" Count :" + val);
    }

    public static void findMax() {
        List<Integer> l = Arrays.asList(12, 12, 3, 4, 15, 16, 16, 8);
        int valu = l.stream().max(Integer::compare).get();

        System.out.println("Value :" + valu);
    }

    
//    string reverse
    
    public static void main(String[] args) {
        Task t = new Task();

        
//        print1();
        duplicates();
//        countValues();
//        findMax();
    }

}
