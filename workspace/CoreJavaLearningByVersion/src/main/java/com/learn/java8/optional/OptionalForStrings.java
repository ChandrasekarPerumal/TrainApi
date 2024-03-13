/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.java8.optional;

import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author mglocadmin
 */
public class OptionalForStrings {

    static Optional<String> str = Optional.of("   This is Java 8 is features ");

    static void replaceString() {
        System.out.println(" " + str.map(s -> s.replaceAll("is", "was")).get());
    }

    static void trimString() {
        // Strip removes - leading & trailing whitespaces
        // Here order is : 1st String level operation and the to character level  
        char chArr[] = str.map(S -> S.strip()).map(String::toCharArray).get();
        int len = str.map(S -> S.strip()).map(String::toCharArray).map(s -> s.length).get();

        for (char c : chArr) {
            System.out.println(c);
        }

        System.out.println("Char length :" + len);
    }

    static void charToString() {

        Stream<Character> chstrm = Stream.of('a', 'b', 'c');
        String s = chstrm.collect(Collector.of());

        System.out.println(s);

    }

    public static void main(String[] args) {

//        replaceString();
//        trimString();
        charToString();
    }

}
